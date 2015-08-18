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
public class AbstractNewUSSD extends AbstractEvent{

    private String message;
    
    public AbstractNewUSSD(Object source) {
        super(source);
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
    
}
