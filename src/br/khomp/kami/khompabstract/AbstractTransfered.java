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
public class AbstractTransfered extends AbstractEvent{

    private String destination;
    
    public AbstractTransfered(Object source) {
        super(source);
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
}
