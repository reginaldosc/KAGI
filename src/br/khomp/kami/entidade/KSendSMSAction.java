/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.entidade;

import org.asteriskjava.manager.action.AbstractManagerAction;

/**
 *
 * @author khomp
 */
public class KSendSMSAction extends AbstractManagerAction{
    
    //variaveis locais para envio de sms
    private String device, message, destination, encoding, wap;
    private boolean confirmation, alert, lineFeed, async;
    private int port;
    
    
    public KSendSMSAction(){
        
    }
    

    @Override
    public String getAction() {
        return "KSendSMS";
    }

    /**
     * @return the device
     */
    public String getDevice() {
        return device;
    }

    /**
     * @param device the device to set
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the confirmation
     */
    public boolean getConfirmation() {
        return isConfirmation();
    }

    /**
     * @param confirmation the confirmation to set
     */
    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    /**
     * @return the encoding
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * @param encoding the encoding to set
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * @return the wap
     */
    public String getWap() {
        return wap;
    }

    /**
     * @param wap the wap to set
     */
    public void setWap(String wap) {
        this.wap = wap;
    }

    /**
     * @return the confirmation
     */
    public boolean isConfirmation() {
        return confirmation;
    }

    /**
     * @return the alert
     */
    public boolean isAlert() {
        return alert;
    }

    /**
     * @param alert the alert to set
     */
    public void setAlert(boolean alert) {
        this.alert = alert;
    }

    /**
     * @return the lineFeed
     */
    public boolean isLineFeed() {
        return lineFeed;
    }

    /**
     * @param lineFeed the lineFeed to set
     */
    public void setLineFeed(boolean lineFeed) {
        this.lineFeed = lineFeed;
    }

    /**
     * @return the async
     */
    public boolean isAsync() {
        return async;
    }

    /**
     * @param async the async to set
     */
    public void setAsync(boolean async) {
        this.async = async;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }
    
}
