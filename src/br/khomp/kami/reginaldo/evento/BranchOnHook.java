/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.reginaldo.evento;

import br.khomp.kami.reginaldo.khompabstract.AbstractEvent;
import br.khomp.kami.reginaldo.util.KAMI;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class BranchOnHook extends AbstractEvent implements InterfaceEvento{
    
    public BranchOnHook(Object source) {
        super(source);
    }

    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento BRANCH ON HOOK ]");
        lista.add("Channel: "+this.getChannel());
        return lista;
    }
}
