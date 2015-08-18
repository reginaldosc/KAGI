/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.khompabstract;

/**
 *
 * @author khomp
 */
public class AbstractNewSMS extends AbstractEvent {

    private String from;
    private String date;
    private String size;
    private String mode;
    private String message;
    private String smsAlert;
    private String smsConcat = "";
    private String smsConcatRef;
    private String smsConcatPartId;
    private String smsConcatParts;
    
    public AbstractNewSMS(Object source) {
        super(source);
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
    public String getSmsAlert() {
        return smsAlert;
    }

    /**
     * @param smsAlert the smsAlert to set
     */
    public void setSmsAlert(String smsAlert) {
        this.smsAlert = smsAlert;
    }

    /**
     * @return the smsConcat
     */
    public String getSmsConcat() {
        return smsConcat;
    }

    /**
     * @param smsConcat the smsConcat to set
     */
    public void setSmsConcat(String smsConcat) {
        this.smsConcat = smsConcat;
    }

    /**
     * @return the smsConcatRef
     */
    public String getSmsConcatRef() {
        return smsConcatRef;
    }

    /**
     * @param smsConcatRef the smsConcatRef to set
     */
    public void setSmsConcatRef(String smsConcatRef) {
        this.smsConcatRef = smsConcatRef;
    }

    /**
     * @return the smsConcatPartId
     */
    public String getSmsConcatPartId() {
        return smsConcatPartId;
    }

    /**
     * @param smsConcatPartId the smsConcatPartId to set
     */
    public void setSmsConcatPartId(String smsConcatPartId) {
        this.smsConcatPartId = smsConcatPartId;
    }

    /**
     * @return the smsConcatParts
     */
    public String getSmsConcatParts() {
        return smsConcatParts;
    }

    /**
     * @param smsConcatParts the smsConcatParts to set
     */
    public void setSmsConcatParts(String smsConcatParts) {
        this.smsConcatParts = smsConcatParts;
    }
    
}
