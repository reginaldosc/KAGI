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
public class KGSMPresentationAction extends AbstractManagerAction{
    
    //variaveis locais para envio de sms
    private String channel, presentation;
    
    
    public KGSMPresentationAction(){
        
    }
    

    @Override
    public String getAction() {
        return "KGSMPresentation";
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

    /**
     * @return the presentation
     */
    public String getPresentation() {
        return presentation;
    }

    /**
     * @param presentation the presentation to set
     */
    public void setPresentation(String presentation) {
        this.presentation = presentation;
        
    }

    
}
