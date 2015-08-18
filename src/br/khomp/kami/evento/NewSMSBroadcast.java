/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.evento;

import br.khomp.kami.khompabstract.AbstractNewSMSBroadcast;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class NewSMSBroadcast extends AbstractNewSMSBroadcast implements InterfaceEvento{

    public NewSMSBroadcast(Object source) {
        super(source);
    }
    
   @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento NEW SMS BROADCAST ]");
        lista.add("Channel: "+this.getChannel());
        lista.add("Serial: "+this.getSerial());
        lista.add("Id: "+this.getId());
        lista.add("Page: "+this.getPage());
        lista.add("PageCount: "+this.getPageCount());
        lista.add("Size: "+this.getSize());
        lista.add("Mode: "+this.getMode());
        lista.add("Message: "+this.getMessage());
        
        return lista;    
    }   
}
