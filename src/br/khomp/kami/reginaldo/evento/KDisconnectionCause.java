/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.reginaldo.evento;

import br.khomp.kami.reginaldo.khompabstract.AbstractKDisconnectionCause;
import br.khomp.kami.reginaldo.util.KAMI;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class KDisconnectionCause extends AbstractKDisconnectionCause implements InterfaceEvento{

    public KDisconnectionCause(Object source) {
        super(source);
    }

    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento KDISCONNECTION CAUSE ]");
        lista.add("Channel: "+this.getChannel());
        lista.add("OrigAddr: "+this.getOrigAddr());
        lista.add("DestAddr: "+this.getDestAddr());
        lista.add("Cause: "+this.getCause());
        lista.add("Cause-txt: "+this.getCauseTxt());
        return lista;
    }

    
    
}
