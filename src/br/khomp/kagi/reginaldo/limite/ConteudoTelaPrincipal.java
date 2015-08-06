/*
 * ConteudoTelaPrincipal.java
 *
 * Created on 1 de Agosto de 2015
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.khomp.kagi.reginaldo.limite;

/**
 *
 *@author  Reginaldo Gon�alves
 * 
 */

public class ConteudoTelaPrincipal {
    
    private String      channel;    
    private String      number;
    private String      connect;
    private String      smsText;
    private String      context     = "default";
    private String      serverIp    = "10.5.0.17";
    private int         serverPort  = 5038;    
    private String      user        = "khomp";
    private String      password    = "betinho";
    private String      eventText   = "\n";
    private String[][]  tabela;
    
    
    public ConteudoTelaPrincipal() {
        
    }
    
    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String text) {
        this.smsText = text;
    }
    
       public void setTabela(String[][] tabela){
        this.tabela = tabela;
    }
    
    public String[][] getTabela(){
        return tabela;
    }
        
    public void setEventText (String eventText){
        //this.eventText = eventText;
        if(eventText.equals("")){
            this.eventText = eventText;
        }
        String aux = this.getEventText() + "";
        //if(!aux.equals("")) {
            this.eventText = aux + "\n" + eventText;
        //}
    }
    
    public String getEventText() {
        return eventText;
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
    
    
}
