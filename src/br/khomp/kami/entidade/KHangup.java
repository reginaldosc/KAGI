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
public class KHangup extends AbstractManagerAction{
    private static final String application = "KHangup";
    private String device;
    private String index;
    
    
    @Override
    public String getAction() {
        return application;
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
     * @return the index
     */
    public String getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(String index) {
        this.index = index;
    }
    
}
