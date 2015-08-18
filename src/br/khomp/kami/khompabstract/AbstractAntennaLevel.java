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
public class AbstractAntennaLevel extends AbstractEvent {
    
    private String signal;
    
    public AbstractAntennaLevel(Object source) {
        super(source);
    }

    /**
     * @return the signal
     */
    public String getSignal() {
        return signal;
    }

    /**
     * @param signal the signal to set
     */
    public void setSignal(String signal) {
        this.signal = signal;
    }
    
}
