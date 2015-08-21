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
public class KSelectSIMcardAction extends AbstractManagerAction{
    
    //variaveis locais para envio de sms
    private String channel;
    private int SIMCard;
    
    
    public KSelectSIMcardAction(){
        
    }
    

    @Override
    public String getAction() {
        return "KSelectSIMCard";
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
     * @return the SIMCard
     */
    public int getSIMCard() {
        return SIMCard;
    }

    /**
     * @param SIMCard the SIMCard to set
     */
    public void setSIMCard(int SIMCard) {
        this.SIMCard = SIMCard;
    }

    
}
