/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.evento;

import br.khomp.kami.khompabstract.AbstractDialBegin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class DialBegin extends AbstractDialBegin implements InterfaceEvento{
    
    public DialBegin(Object source){
        super(source);
        
    }

    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        if(this.getUniqueid()!=null){
            lista.add("\n[ Evento DIAL BEGIN ]");
            lista.add("Channel: "+this.getChannel());
            lista.add("DestChannel: "+this.getDestchannel());
        }
        return lista;    
    }
    
}
