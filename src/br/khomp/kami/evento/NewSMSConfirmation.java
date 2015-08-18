/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.evento;

import br.khomp.kami.khompabstract.AbstractNewSMSConfirmation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class NewSMSConfirmation extends AbstractNewSMSConfirmation implements InterfaceEvento{

    public NewSMSConfirmation(Object source) {
        super(source);
    }
   
    
    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento NEW SMS CONFIRMATION ]");
        lista.add("Channel: "+this.getChannel());
        lista.add("From: "+this.getFrom());
        lista.add("Date: "+this.getDate());
        lista.add("DeliveryDate: "+this.getDeliveryDate());
        lista.add("Status: "+this.getStatus());
        lista.add("Message Reference: "+this.getMessageReference());
                
        return lista;    
    }   
}
