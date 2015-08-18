/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.evento;

import br.khomp.kami.khompabstract.AbstractNewSMS;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class NewSMS extends AbstractNewSMS implements InterfaceEvento{
    
    public NewSMS(Object source) {
        super(source);
    }

    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento NEW SMS ]");
        lista.add("Channel: "+this.getChannel());
        lista.add("From: "+this.getFrom());
        lista.add("Date: "+this.getDate());
        lista.add("Size: "+this.getSize());
        lista.add("Mode: "+this.getMode());
        lista.add("Message: "+this.getMessage());
        lista.add("SmsAlert: "+this.getSmsAlert());
        if(!this.getSmsConcat().isEmpty()){
            lista.add("SmsConcatRef: "+this.getSmsConcatRef());
            lista.add("SmsConcatPartId: "+this.getSmsConcatPartId());
            lista.add("SmsConcatParts: "+this.getSmsConcatParts());
        } 
        return lista;    
    }
    
    

}
