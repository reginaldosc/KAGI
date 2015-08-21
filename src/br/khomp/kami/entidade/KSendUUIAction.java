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
public class KSendUUIAction extends AbstractManagerAction{
    
    //variaveis locais para envio de UUI
    private String device, data, protocol, length;
    
    
    public KSendUUIAction(){
        
    }
    

    @Override
    public String getAction() {
        return "";
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
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param message the data to set
     */
    public void setData(String message) {
        this.data = message;
    }

    /**
     * @return the protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * @param destination the protocol to set
     */
    public void setProtocol(String destination) {
        this.protocol = destination;
    }

    
    /**
     * @return the length
     */
    public String getLength() {
        return length;
    }

    /**
     * @param wap the length to set
     */
    public void setLength(String wap) {
        this.length = wap;
    }

    
    
}
