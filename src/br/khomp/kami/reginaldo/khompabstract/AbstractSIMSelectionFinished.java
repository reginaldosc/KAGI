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
public class AbstractSIMSelectionFinished extends AbstractEvent{

    private String registry;
    
    public AbstractSIMSelectionFinished(Object source) {
        super(source);
    }

    /**
     * @return the registry
     */
    public String getRegistry() {
        return registry;
    }

    /**
     * @param registry the registry to set
     */
    public void setRegistry(String registry) {
        this.registry = registry;
    }
    
}
