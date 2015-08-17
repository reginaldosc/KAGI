/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.reginaldo.khompabstract;

/**
 *
 * @author khomp
 */
public class AbstractKDisconnectionCause extends AbstractEvent{

    private String origAddr;
    private String destAddr;
    private String cause;
    private String causeTxt;
    
    public AbstractKDisconnectionCause(Object source) {
        super(source);
    }

    /**
     * @return the origAddr
     */
    public String getOrigAddr() {
        return origAddr;
    }

    /**
     * @param origAddr the origAddr to set
     */
    public void setOrigAddr(String origAddr) {
        this.origAddr = origAddr;
    }

    /**
     * @return the destAddr
     */
    public String getDestAddr() {
        return destAddr;
    }

    /**
     * @param destAddr the destAddr to set
     */
    public void setDestAddr(String destAddr) {
        this.destAddr = destAddr;
    }

    /**
     * @return the cause
     */
    public String getCause() {
        return cause;
    }

    /**
     * @param cause the cause to set
     */
    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * @return the causeTxt
     */
    public String getCauseTxt() {
        return causeTxt;
    }

    /**
     * @param causeTxt the causeTxt to set
     */
    public void setCauseTxt(String causeTxt) {
        this.causeTxt = causeTxt;
    }
    
}
