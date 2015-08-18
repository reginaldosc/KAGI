/*
 * Aplicacao.java
 *
 * Created on 1 de Agosto de 2015
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package br.khomp.kami.controle;

import br.khomp.kami.entidade.Call;
import br.khomp.kami.limite.ConteudoTelaPrincipal;
import br.khomp.kami.limite.TelaPrincipal;
import br.khomp.kami.limite.TelaSobre;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Reginaldo Goncalves
 */
public class Aplicacao {

    private String ip, user, password, txtEvents;
    private int port;
    public int actionID = 0;
    public int choosenTest = 0;

    private static final int timeout = 3000; // timeout para esposta de conexao com o socket
    private static final String CRLF = "\r\n"; // nova linha
    //private final String p_Response;

    private Socket mySocket;
    private PrintWriter output;
    private BufferedReader input;
    private SocketAddress sockaddr = null;
    
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
        this.txtEvents = null;
        telaPrincipal.setIconImage(null);
        telaPrincipal.habilitaCampos();
        telaPrincipal.mostraTela(true);
        //this.montaTabela(new String[]{"1","2"});
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
                choosenTest = 0;
                System.out.println("Asterisk test selected.");
                break;
            case "F":
                choosenTest = 1;
                System.out.println("FreeSwitch test selected.");
                JOptionPane.showMessageDialog(telaPrincipal, "teste não implementado!");
                break;
            default:
                choosenTest = -1;
                System.out.println("Invalid test!");
                break;
        }
    }

    /* Chamada ao apertar o botão Login na tela Principal */
    /**
     * 
     * @return
     * @throws IOException 
     */
    public boolean onConnect() throws IOException {

        /* variaveis locais */
        ip = conteudo.getServerIp();
        port = conteudo.getServerPort();
        user = conteudo.getUser();
        password = conteudo.getPassword();

        boolean back = false;

        txtEvents = "Trying Connection to: " + ip + ":" + port;
        conteudo.setJlConnection(txtEvents);
        telaPrincipal.changeJlConnection();
        this.changeInfo(txtEvents);

        /* Cria Socket */
        mySocket = new Socket();
        sockaddr = new InetSocketAddress(ip, port);

        try {
            mySocket.connect(sockaddr, timeout);

        } catch (Exception e) {
            System.out.println("Exception while creating socket,Reason is:" + e.getMessage());
        }

        String req = ("Action: Login" + CRLF
                + "Username: " + user + CRLF
                + "Secret: " + password + CRLF + CRLF);

        this.changeInfo(req);

        if (mySocket.isConnected()) {
            txtEvents = "Connected on: " + ip + ":" + port;

            conteudo.setJlConnection(txtEvents);
            this.changeInfo(txtEvents);

            output = new PrintWriter(mySocket.getOutputStream(), true);
            input = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));

            this.sendData(req);
            if (this.receiveData(input)) {
                back = true;
            }
        }
        return back;
    }

    /* Metodo chamado ao apertar o botão Call na tela Principal */
    /**
     * 
     */
    public void onDisconnect() {

        String req = ("Action: Logoff" + CRLF + CRLF);
        this.changeInfo(req);

        this.sendData(req);
        if (this.receiveData(input)) {
            try {
                output.close();
                input.close();
                mySocket.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            txtEvents = "Disconnected...";
            conteudo.setJlConnection(txtEvents);
            telaPrincipal.changeJlConnection();
            this.changeInfo(txtEvents);
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
    public boolean onCall() {

        String number = conteudo.getNumber();
        String channel = conteudo.getChannel();
        String context = conteudo.getContext();
        int priority = 1;
        boolean back = false;
        int actID = this.actionID + 1;

        this.actionID = actID;

        if (!number.equals("") && !channel.equals("") && !context.equals("")) {
            String callParam
                    = ("Action: Originate" + CRLF
                    + "ActionID: " + actID + CRLF
                    + "Channel: sip/" + channel + CRLF
                    + "Context: " + context + CRLF
                    + "Exten: " + number + CRLF
                    + "Priority: " + priority + CRLF + CRLF);

            this.changeInfo(callParam);

            if (mySocket.isConnected()) {
                this.sendData(callParam);
                //this.receiveData(input);
                System.out.println("Calling to " + "Channel:" + channel + ", Extension:" + number);
                if (this.receiveData(input)) {
                    
                    back = true;

                    // cria e popula objeto call
                    Call call = new Call();
                    call.setActionID(Integer.toString(actID));
                    call.setChannel(channel);
                    call.setStatus("Connected");

                    conteudo.setTabela(call);
                }
                telaPrincipal.mostraTabelaChannels();
            }
        } else {
            System.out.println("Existem valores em branco!");
        }

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

        if (mySocket.isConnected()) {
            this.sendData(callParam);
            if(this.receiveData(input)){
                back = true;
                System.out.println("Hanging up..." + actionID);
            }
        }

        return back;
    }

    /**
     * 
     */
    public void cbSMSischanged() {

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

        String channel = conteudo.getChannel();
        String text = conteudo.getSmsText();
        String number = conteudo.getNumber();
        boolean back = false;
        boolean confirmation = conteudo.getConfirmation();
        int actID = this.actionID + 1;

        this.actionID = actID;
        String smsParam
                = ("Action: KSendSMS" + CRLF
                + "ActionID: " + actID + CRLF
                + "device: " + channel + CRLF
                + "destination: " + number + CRLF
                + "Message: " + text + CRLF
                + "Confirmation: " + confirmation + CRLF + CRLF);

        this.sendData(smsParam);
        this.changeInfo(smsParam);
        if (this.receiveData(input)){
            back = true;
            //this.changeInfo(smsParam);
        }

        System.out.println("Sending SMS to " + number);
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
