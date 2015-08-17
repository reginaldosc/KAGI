/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.reginaldo.khompabstract;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 *
 * @author khomp
 */
public class AbstractKhompChannelEvent extends ManagerEvent{

    private String channel;
    private String from, date, size, mode, message;
    private boolean smsAlert;
    //variaveis opcionais
    private boolean smsConcat;
    private int smsConcatRef, smsConcatPartID, smsConcatParts, id; 
    
    
    public AbstractKhompChannelEvent(Object source) {
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

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * @param mode the mode to set
     */
    public void setMode(String mode) {
        this.mode = mode;
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
     * @return the smsAlert
     */
    public boolean isSmsAlert() {
        return smsAlert;
    }

    /**
     * @param smsAlert the smsAlert to set
     */
    public void setSmsAlert(boolean smsAlert) {
        this.smsAlert = smsAlert;
    }

    /**
     * @return the smsConcat
     */
    public boolean isSmsConcat() {
        return smsConcat;
    }

    /**
     * @param smsConcat the smsConcat to set
     */
    public void setSmsConcat(boolean smsConcat) {
        this.smsConcat = smsConcat;
    }

    /**
     * @return the smsConcatRef
     */
    public int getSmsConcatRef() {
        return smsConcatRef;
    }

    /**
     * @param smsConcatRef the smsConcatRef to set
     */
    public void setSmsConcatRef(int smsConcatRef) {
        this.smsConcatRef = smsConcatRef;
    }

    /**
     * @return the smsConcatPartID
     */
    public int getSmsConcatPartID() {
        return smsConcatPartID;
    }

    /**
     * @param smsConcatPartID the smsConcatPartID to set
     */
    public void setSmsConcatPartID(int smsConcatPartID) {
        this.smsConcatPartID = smsConcatPartID;
    }

    /**
     * @return the smsConcatParts
     */
    public int getSmsConcatParts() {
        return smsConcatParts;
    }

    /**
     * @param smsConcatParts the smsConcatParts to set
     */
    public void setSmsConcatParts(int smsConcatParts) {
        this.smsConcatParts = smsConcatParts;
    }

    public int getId() {
        return id;
    }
    
}
