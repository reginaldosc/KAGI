/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.khompabstract;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 *
 * @author khomp
 */
public class AbstractEvent extends ManagerEvent {
    private String channel;
    
    public AbstractEvent(Object source) {
        super(source);
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
