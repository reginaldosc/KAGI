/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.evento;

import br.khomp.kami.khompabstract.AbstractTransfered;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class Transfered extends AbstractTransfered implements InterfaceEvento{

    public Transfered(Object source) {
        super(source);
    }
    
    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento COLLECT CALL ]");
        lista.add("Channel: "+this.getChannel());
        lista.add("Destination: "+this.getDestination());
        return lista;    
    }
}
