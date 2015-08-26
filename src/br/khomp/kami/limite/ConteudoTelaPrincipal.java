/*
 * ConteudoTelaPrincipal.java
 *
 * Created on 1 de Agosto de 2015
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.khomp.kami.limite;

import br.khomp.kami.entidade.Call;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 *@author  Reginaldo Gon�alves
 * 
 */

public class ConteudoTelaPrincipal extends Observable {
    
    private String      channel     = "b2c1";    
    private String      number      = "84279344";
    private String      connect;
    private boolean     confirmation;
    private String      smsText     = "olá!";
    private String      context     = "internal";
    private String      serverIp    = "10.5.0.17";
    private int         serverPort  = 5038;    
    private String      user        = "khomp";
    private String      password    = "betinho";
    private String      eventText   = "\n";
    private String      tech        = "Khomp";
    private final List<Call>  tabela      = new ArrayList<>();
    private String      ussdDevice;
    private String      ussdMessage;
    private String      SimCardChannel;
    private int         simCardSelected;
    private String      uuiDevice;
    private String      uuiProtocol;
    private String      uuiLength;
    private String      uuiData;
    private String      channelPresentation;
    private String      presentation;
    private String callOption;
 
    
    public ConteudoTelaPrincipal() {
    }
    
    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String text) {
        this.smsText = text;
    }
    
       public void setTabela(Call tabela){
        this.tabela.add(tabela);                     
    }
    
    public List<Call> getTabela(){
        return tabela;
    }
        
    public void setEventText (String eventText){
        //this.eventText = eventText;
        if (eventText.equals("")) {
            this.eventText = eventText;
        } else {
            String aux = this.getEventText() + "";
            this.eventText = aux + "\n" + eventText;
        }
        //Notifica TelaPrincipal que chegou um evento
        setChanged();
        notifyObservers();

    }
    
    public String getEventText() {
        return this.eventText;
    }
    
    public void setChannel(String channel){
        this.channel = channel;
    }
    
    public String getChannel(){
        return channel;
    }
    
    public void setContext(String context){
        this.context = context;
    }
    
    public String getContext(){
        return context;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    public String getNumber(){
        return number;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setServerIp(String serverIp){
        this.serverIp = serverIp;
    }
    
    public String getServerIp(){
        return serverIp;
    }
    
    public void setServerPort(int serverPort){
        this.serverPort = serverPort;
    }
    
    public int getServerPort(){
        return serverPort;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public String getUser(){
        return user;
    }

    public void setJlConnection(String txtEvents) {
        this.connect = txtEvents;
    }
    
    public String getJlConnection() {
        return connect;
    }

    void setConfirmation(boolean selected) {
        this.confirmation = selected;
    }
    
    public boolean getConfirmation(){
        return confirmation;
    }

    /**
     * @return the tech
     */
    public String getTech() {
        return tech;
    }

    /**
     * @param tech the tech to set
     */
    public void setTech(String tech) {
        this.tech = tech;
    }

    
    public String getUSSDDevice(){
        return this.ussdDevice;
    }
        
    public void setUSSDDevice(String text) {
        this.ussdDevice = text;
    }
    
    public String getUSSDMessage(){
        return this.ussdMessage;
    }
    
    public void setUSSDMessage(String text) {
        this.ussdMessage = text;
    }

    
    public void setSimCardChannel(String text) {
        this.SimCardChannel = text;
    }
    
    public String getSimCardChannel() {
        return this.SimCardChannel;
    }

    
    public void setSimCardSelected(int selectedIndex) {
        this.simCardSelected = selectedIndex;
    }
    
    public int getSimCardSelected() {
        return this.simCardSelected;
    }

    /**
     * @return the uuiDevice
     */
    public String getUuiDevice() {
        return uuiDevice;
    }

    /**
     * @param uuiDevice the uuiDevice to set
     */
    public void setUuiDevice(String uuiDevice) {
        this.uuiDevice = uuiDevice;
    }

    /**
     * @return the uuiProtocol
     */
    public String getUuiProtocol() {
        return uuiProtocol;
    }

    /**
     * @param uuiProtocol the uuiProtocol to set
     */
    public void setUuiProtocol(String uuiProtocol) {
        this.uuiProtocol = uuiProtocol;
    }

    /**
     * @return the uuiLength
     */
    public String getUuiLength() {
        return uuiLength;
    }

    /**
     * @param uuiLength the uuiLength to set
     */
    public void setUuiLength(String uuiLength) {
        this.uuiLength = uuiLength;
    }

    /**
     * @return the uuiData
     */
    public String getUuiData() {
        return uuiData;
    }

    /**
     * @param uuiData the uuiData to set
     */
    public void setUuiData(String uuiData) {
        this.uuiData = uuiData;
    }

    /**
     * @return the channelPresentation
     */
    public String getChannelPresentation() {
        return channelPresentation;
    }

    /**
     * @param channelPresentation the channelPresentation to set
     */
    public void setChannelPresentation(String channelPresentation) {
        this.channelPresentation = channelPresentation;
    }

    /**
     * @return the presentation
     */
    public String getPresentation() {
        return presentation;
    }

    /**
     * @param presentation the presentation to set
     */
    public void setPresentation(boolean presentation) {
        if (presentation)
            this.presentation = "restricted";
        else
            this.presentation = "notrestricted";
    }

    void setCallOption(String botao) {
        this.callOption = botao;
//        if(botao.equalsIgnoreCase("ramal")){
//            
//        } else {
//            
//        }
        
    }
    
    
}
/*
 * ConteudoTelaPrincipal.java
 *
 * Created on 1 de Agosto de 2015
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.khomp.kami.limite;

import br.khomp.kami.entidade.Call;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 *@author  Reginaldo Gon�alves
 * 
 */

public class ConteudoTelaPrincipal extends Observable {
    
    private String      channel     = "b2c1";    
    private String      number      = "84279344";
    private String      connect;
    private boolean     confirmation;
    private String      smsText     = "olá!";
    private String      context     = "internal";
    private String      serverIp    = "10.5.0.17";
    private int         serverPort  = 5038;    
    private String      user        = "khomp";
    private String      password    = "betinho";
    private String      eventText   = "\n";
    private String      tech        = "Khomp";
    private final List<Call>  tabela      = new ArrayList<>();
    private String      ussdDevice;
    private String      ussdMessage;
    private String      SimCardChannel;
    private int         simCardSelected;
    private String      uuiDevice;
    private String      uuiProtocol;
    private String      uuiLength;
    private String      uuiData;
    private String      channelPresentation;
    private String      presentation;
    private String      callOption;
    private String      data;
    private String      application;
   
    
    public ConteudoTelaPrincipal() {
    }
    
    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String text) {
        this.smsText = text;
    }
    
       public void setTabela(Call tabela){
           
        this.tabela.add(tabela);                     
    }
    
    public List<Call> getTabela(){
        return tabela;
    }
        
    public void setEventText (String eventText){
        //this.eventText = eventText;
        if(eventText.equals("")){
            this.eventText = eventText;
        }
        String aux = this.getEventText() + "";
        this.eventText = aux + "\n" + eventText;
        
        //Notifica TelaPrincipal que chegou um evento
        setChanged();
        notifyObservers();
        
    }
    
    public String getEventText() {
        return this.eventText;
    }
    
    public void setChannel(String channel){
        this.channel = channel;
    }
    
    public String getChannel(){
        return channel;
    }
    
    public void setContext(String context){
        this.context = context;
    }
    
    public String getContext(){
        return context;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    public String getNumber(){
        return number;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setServerIp(String serverIp){
        this.serverIp = serverIp;
    }
    
    public String getServerIp(){
        return serverIp;
    }
    
    public void setServerPort(int serverPort){
        this.serverPort = serverPort;
    }
    
    public int getServerPort(){
        return serverPort;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public String getUser(){
        return user;
    }

    public void setJlConnection(String txtEvents) {
        this.connect = txtEvents;
    }
    
    public String getJlConnection() {
        return connect;
    }

    void setConfirmation(boolean selected) {
        this.confirmation = selected;
    }
    
    public boolean getConfirmation(){
        return confirmation;
    }

    /**
     * @return the tech
     */
    public String getTech() {
        return tech;
    }

    /**
     * @param tech the tech to set
     */
    public void setTech(String tech) {
        this.tech = tech;
    }

    
    public String getUSSDDevice(){
        return this.ussdDevice;
    }
        
    public void setUSSDDevice(String text) {
        this.ussdDevice = text;
    }
    
    public String getUSSDMessage(){
        return this.ussdMessage;
    }
    
    public void setUSSDMessage(String text) {
        this.ussdMessage = text;
    }

    
    public void setSimCardChannel(String text) {
        this.SimCardChannel = text;
    }
    
    public String getSimCardChannel() {
        return this.SimCardChannel;
    }

    
    public void setSimCardSelected(int selectedIndex) {
        this.simCardSelected = selectedIndex;
    }
    
    public int getSimCardSelected() {
        return this.simCardSelected;
    }

    /**
     * @return the uuiDevice
     */
    public String getUuiDevice() {
        return uuiDevice;
    }

    /**
     * @param uuiDevice the uuiDevice to set
     */
    public void setUuiDevice(String uuiDevice) {
        this.uuiDevice = uuiDevice;
    }

    /**
     * @return the uuiProtocol
     */
    public String getUuiProtocol() {
        return uuiProtocol;
    }

    /**
     * @param uuiProtocol the uuiProtocol to set
     */
    public void setUuiProtocol(String uuiProtocol) {
        this.uuiProtocol = uuiProtocol;
    }

    /**
     * @return the uuiLength
     */
    public String getUuiLength() {
        return uuiLength;
    }

    /**
     * @param uuiLength the uuiLength to set
     */
    public void setUuiLength(String uuiLength) {
        this.uuiLength = uuiLength;
    }

    /**
     * @return the uuiData
     */
    public String getUuiData() {
        return uuiData;
    }

    /**
     * @param uuiData the uuiData to set
     */
    public void setUuiData(String uuiData) {
        this.uuiData = uuiData;
    }

    /**
     * @return the channelPresentation
     */
    public String getChannelPresentation() {
        return channelPresentation;
    }

    /**
     * @param channelPresentation the channelPresentation to set
     */
    public void setChannelPresentation(String channelPresentation) {
        this.channelPresentation = channelPresentation;
    }

    /**
     * @return the presentation
     */
    public String getPresentation() {
        return presentation;
    }

    /**
     * @param presentation the presentation to set
     */
    public void setPresentation(boolean presentation) {
        if (presentation)
            this.presentation = "restricted";
        else
            this.presentation = "notrestricted";
    }

    
    
    

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the application
     */
    public String getApplication() {
        return application;
    }

    /**
     * @param application the application to set
     */
    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * @return the callOption
     */
    public String getCallOption() {
        return callOption;
    }

    /**
     * @param callOption the callOption to set
     */
    public void setCallOption(String callOption) {
        this.callOption = callOption;
    }
    
    
}
