/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.evento;

import br.khomp.kami.khompabstract.AbstractSIMSelectionFinished;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class SIMSelectionFinished extends AbstractSIMSelectionFinished implements InterfaceEvento{

    public SIMSelectionFinished(Object source) {
        super(source);
    }

    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento SIM SELECTION FINISHED ]");
        lista.add("Channel: "+this.getChannel());
        lista.add("Registry: "+this.getRegistry());
        return lista;
        
    }
}
