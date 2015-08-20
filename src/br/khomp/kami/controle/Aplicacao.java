/*
 * Aplicacao.java
 *
 * Created on 1 de Agosto de 2015
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package br.khomp.kami.controle;

import br.khomp.kami.entidade.Call;
import br.khomp.kami.entidade.SendSMSAction;
import br.khomp.kami.evento.*;
import br.khomp.kami.limite.ConteudoTelaPrincipal;
import br.khomp.kami.limite.TelaPrincipal;
import br.khomp.kami.limite.TelaSobre;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.asteriskjava.manager.AuthenticationFailedException;
import org.asteriskjava.manager.ManagerConnection;
import org.asteriskjava.manager.ManagerConnectionFactory;
import org.asteriskjava.manager.ManagerConnectionState;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.SendActionCallback;
import org.asteriskjava.manager.TimeoutException;
import org.asteriskjava.manager.action.HangupAction;
import org.asteriskjava.manager.action.ManagerAction;
import org.asteriskjava.manager.action.OriginateAction;
import org.asteriskjava.manager.event.ManagerEvent;
import org.asteriskjava.manager.response.ManagerResponse;

/**
 *
 * @author Reginaldo Goncalves
 */
public class Aplicacao implements ManagerEventListener, SendActionCallback {

    private String ip, user, password, txtEvents;
    private int port;
    public int actionID = 0;
    private static final int timeout = 3000; // timeout para esposta de conexao com o socket
    private static final String CRLF = "\r\n"; // nova linha
    private ManagerConnection managerConnection;
    private ManagerAction managerAction;
    private Socket mySocket;
    private PrintWriter output;
    private BufferedReader input;
    private SocketAddress sockaddr = null;

    @Override
    public void onResponse(ManagerResponse mr) {
        String aux;
        aux = mr.getResponse() + ". " + mr.getMessage();
        System.out.println("Response: " + aux);
        conteudo.setEventText(aux);        
    }

    public void exportLog() {
        String text = conteudo.getEventText();
        System.out.println("Logs:\n" + text);
    }
     
    private enum CausesEnum { 
        CAUSE_NOTDEFINED("11"),
        CAUSE_NORMAL("12"),
        CAUSE_BUSY("13"),
        CAUSE_FAILURE("14"),
        CAUSE_CONGESTION("15"),
        CAUSE_UNALLOCATED("16");
        
        
        public String valorCause; 
        CausesEnum(String valor) { 
            valorCause = valor; 
        } 
    }

    TelaPrincipal telaPrincipal = new TelaPrincipal(this);
    ConteudoTelaPrincipal conteudo = telaPrincipal.getConteudo();

    /**
     * Creates a new instance of Aplicacao
     */
    public Aplicacao() {
        telaPrincipal.setIconImage(null);
        telaPrincipal.habilitaCampos();
        telaPrincipal.mostraTela(true);
    }

    /* mostra a tela - Sobre */
    /**
     * 
     */
    public void sobre() {
        TelaSobre tela = new TelaSobre(telaPrincipal, true);
        tela.mostraTela(true);
    }

    /* selecao entre asterisk e freeswitch */
    /**
     * 
     * @param teste 
     */
    public void teste(String teste) {
        switch (teste) {
            case "A":
                System.out.println("Asterisk test selected.");
                break;
            case "F":
                System.out.println("FreeSwitch test selected.");
                JOptionPane.showMessageDialog(telaPrincipal, "teste não implementado!");
                break;
            default:
                System.out.println("Invalid test!");
                break;
        }
    }

    private void tratarEvento(InterfaceEvento interfaceEvento){
        for(String str:interfaceEvento.getAll()){
            conteudo.setEventText(str);
        }
    }
    
    @Override
    public void onManagerEvent(ManagerEvent event) {
        System.out.println("evento: "+ event);
        if(event instanceof InterfaceEvento){
            tratarEvento((InterfaceEvento)event);
        }
    }
    
    private void registrarClasses(){
        this.managerConnection.registerUserEventClass(Alarm.class);
        this.managerConnection.registerUserEventClass(AlarmClear.class);   
        this.managerConnection.registerUserEventClass(AnswerInfo.class);   
        this.managerConnection.registerUserEventClass(AntennaLevel.class);   
        this.managerConnection.registerUserEventClass(BranchOffHook.class);   
        this.managerConnection.registerUserEventClass(BranchOnHook.class);   
        this.managerConnection.registerUserEventClass(CollectCall.class);   
        this.managerConnection.registerUserEventClass(KDisconnectionCause.class);   
        this.managerConnection.registerUserEventClass(NewSMS.class);   
        this.managerConnection.registerUserEventClass(NewSMSBroadcast.class);   
        this.managerConnection.registerUserEventClass(NewSMSConfirmation.class);   
        this.managerConnection.registerUserEventClass(NewUSSD.class);   
        this.managerConnection.registerUserEventClass(OperatorRegistry.class);   
        this.managerConnection.registerUserEventClass(SIMSelectionFinished.class);   
        this.managerConnection.registerUserEventClass(Transfered.class);   
    }
    
    /* Chamada ao apertar o botão Login na tela Principal */
    /**
     * 
     * @return
     * @throws IOException 
     */
    public boolean onConnect() throws IOException{
        /* variaveis locais */
        boolean back = false;
        ip = conteudo.getServerIp();
        port = conteudo.getServerPort();
        user = conteudo.getUser();
        password = conteudo.getPassword();
        
        ManagerConnectionFactory factory = new ManagerConnectionFactory(
                        ip, user, password);

        this.managerConnection = factory.createManagerConnection();
        //registro para eventos
        this.managerConnection.addEventListener(this);
        
                
        txtEvents = "Trying Connection to: " + ip + ":" + port;
        conteudo.setJlConnection(txtEvents);
        telaPrincipal.changeJlConnection();
        this.changeInfo(txtEvents);
     
        try {
            //efetiva login
            this.managerConnection.login();

        } catch (IllegalStateException | AuthenticationFailedException | TimeoutException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(this.managerConnection.getState() == ManagerConnectionState.CONNECTED){
            registrarClasses();
            txtEvents = "Connected on: " + ip + ":" + port;
            conteudo.setJlConnection(txtEvents);
            this.changeInfo(txtEvents);
            back = true;
        }
           
        return back;
    }
        

    /* Metodo chamado ao apertar o botão Call na tela Principal */
    /**
     * 
     */
    public void onDisconnect() {

        if(ManagerConnectionState.CONNECTED == this.managerConnection.getState()){
            this.managerConnection.logoff();
            txtEvents = "Disconnected from: " + ip + ":" + port;
            conteudo.setJlConnection(txtEvents);
        }
    }

    /**
     * 
     * @return 
     */
    public boolean sendPing() {
        ip = conteudo.getServerIp();
        port = conteudo.getServerPort();

        boolean retv = false;
        try {
            System.out.println("Sending a Ping.");
            InputStream ins = Runtime.getRuntime().exec("ping -n 1 -w 2000 " + ip).getInputStream();
            Thread.sleep(3000);
            byte[] prsbuf = new byte[ins.available()];
            ins.read(prsbuf);
            String parsstr = new StringTokenizer(new String(prsbuf), "%").nextToken().trim();

            if (!parsstr.endsWith("100")) {
                retv = true;
            }
            //System.out.println(parsstr);
            this.changeInfo(parsstr);
        } catch (IOException | InterruptedException e) {
            System.out.println("IOException" + e.getMessage());
            retv = false;
        }
        return retv;
    }

    /**
     * 
     * @return 
     */
    @SuppressWarnings("null")
    public int onCall() {

        String number = conteudo.getNumber();
        String channel = conteudo.getChannel();
        String context = conteudo.getContext();
        String tech = conteudo.getTech();
        int priority = 1;
        int timeOut = 30000;
        int back = 0;
        int actID = this.actionID + 1;

        this.actionID = actID;

        OriginateAction originateAction;
        SendActionCallback sendCB = this;

        originateAction = new OriginateAction();


        if (!number.equals("") && !channel.equals("") && !context.equals("")) {
            originateAction.setActionId(String.valueOf(actID));

            if (tech.equalsIgnoreCase("Khomp")) {
                originateAction.setChannel(tech + "/" + channel + "/" + number);
            } else {
                originateAction.setChannel(tech + "/" + number);
            }
            
            originateAction.setContext(context);
            originateAction.setExten(number);
            originateAction.setPriority(priority);
            originateAction.setTimeout(timeOut);
            back = 1;
        } else {
            System.out.println("Existem valores em branco!");
            return back;
        }

        if (ManagerConnectionState.CONNECTED == this.managerConnection.getState()) {
            System.out.println("Calling to " + "Channel:" + channel + ", Extension:" + number);
            
            try {
                managerConnection.sendAction(originateAction, sendCB);   
            } catch (IOException | IllegalArgumentException | IllegalStateException ex) {
                Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            back = -1;
        }

        String callParam
                = ("Action: Originate" + CRLF
                + "ActionID: " + originateAction.getActionId() + CRLF
                + "Channel: " + originateAction.getChannel() + CRLF
                + "Context: " + originateAction.getContext() + CRLF
                + "Exten: " + originateAction.getExten() + CRLF
                + "Priority: " + originateAction.getPriority() + CRLF + CRLF);

        this.changeInfo(callParam);

        // cria e popula objeto call
        Call call = new Call();
        call.setActionID(Integer.toString(actID));
        call.setChannel(channel);
        call.setStatus("Connected");

        conteudo.setTabela(call);
        return back;
    }

    /**
     * 
     * @param actionID
     * @param channel
     * @return 
     */
    public boolean hangUp(String actionID, String channel) {
        boolean back = false;
        String cause = "";

        
        
        String callParam
                = ("Action: Hangup" + CRLF
                + "ActionID: " + actionID + CRLF
                + "Channel: " + channel + CRLF
                + "Cause: " + cause + CRLF + CRLF);

        this.changeInfo(callParam);
        
        HangupAction hangupAct;
        SendActionCallback sendCB = this;

        hangupAct = new HangupAction();
        
        hangupAct.setActionId(actionID);
        hangupAct.setChannel(channel);
        
        try {
            managerConnection.sendAction(hangupAct, sendCB);
        } catch (IOException | IllegalArgumentException | IllegalStateException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }

//        if (mySocket.isConnected()) {
//            this.sendData(callParam);
//            if(this.receiveData(input)){
//                back = true;
//                System.out.println("Hanging up..." + actionID);
//            }
//        }

        return back;
    }

    /**
     * 
     */
    public void cbSMSischanged() {

    }
    
    public boolean sendSMS(){
        SendSMSAction action;
        action = new SendSMSAction();
        
        action.setDevice(conteudo.getChannel());
        action.setDestination(conteudo.getNumber());
        action.setMessage(conteudo.getSmsText());
        
        try {
            managerConnection.sendAction(action, this);
        } catch (IOException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    /**
     * Action: KSendSMS
     * ActionID:
     * Device:
     * Destination:
     * Confirmation:
     * Message:
     * @return 
     **/ 
    public boolean sendSms() {

        String channel          = conteudo.getChannel();
        String text             = conteudo.getSmsText();
        String number           = conteudo.getNumber();
        String context          = conteudo.getContext();
        String tech             = conteudo.getTech();
        String action           = "KSendSMS"; 
        boolean back            = false;
        boolean confirmation    = conteudo.getConfirmation();
        int actID               = this.actionID + 1;
        this.actionID           = actID;
        String smsParam;
        
        OriginateAction originateSmsAction;
        SendActionCallback sendCB = this;
        
        
       originateSmsAction = new OriginateAction();


       if (!number.equals("") && !channel.equals("") && !text.equals("")) {
           
            smsParam         = ("Action: " + action + CRLF
                                + "ActionID: " + actID + CRLF
                                + "device: " + channel + CRLF
                                + "destination: " + number + CRLF
                                + "Message: " + text + CRLF
                                + "Confirmation: " + confirmation + CRLF + CRLF);
           
//            originateSmsAction.setActionId(String.valueOf(actID));

            if (tech.equalsIgnoreCase("Khomp")) {
                originateSmsAction.setVariable("Message", text);
                originateSmsAction.setVariable("Action", action);
                originateSmsAction.setChannel(tech + "/" + channel + "/" + number);
            } else {
                originateSmsAction.setChannel(tech + "/" + number);
            }

            originateSmsAction.setContext(context);
            originateSmsAction.setActionId("KSendSMS");
            originateSmsAction.setPriority(1);
            originateSmsAction.setExten(number);

            back = true;
       } else {
            System.out.println("Existem valores em branco!");
            return back;
        }

        if (ManagerConnectionState.CONNECTED == this.managerConnection.getState()) {
           
            try {
                managerConnection.sendAction(originateSmsAction, sendCB);   
            } catch (IOException | IllegalArgumentException | IllegalStateException ex) {
                Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Sending SMS to " + number);
        this.changeInfo(smsParam);                
        return back;
        
        
    }

    /**
     * 
     * @param req 
     */
    private void sendData(String req) {
        System.out.println(CRLF + req);
        output.write(req);
        output.flush();
    }

    /**
     * 
     * @param input
     * @return 
     */
    private boolean receiveData(BufferedReader input) {
        boolean back = false;
        String txt;
        try {
            while (!(txt = input.readLine()).equals("")) {
                this.changeInfo(txt);
                if (txt.equalsIgnoreCase("Response: Success")) {
                    back = true;
                } else if (txt.equalsIgnoreCase("Response: Goodbye")) {
                    back = true;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return back;
    }

    /* Atualiza tela de Eventos e logs */
    /**
     *
     * @param text
     */
    public void changeInfo(String text) {

        System.out.println(text);
        conteudo.setEventText(text);
        telaPrincipal.setCampos();
    }   
    

}
