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
public class KDialOffHook extends AbstractManagerAction {

    private String number;
    private String channel;
    
    public KDialOffHook(){
        
    }
    
    @Override
    public String getAction() {
        return "KDialOffHook";
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }
    
}
