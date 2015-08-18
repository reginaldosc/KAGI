/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.evento;

import br.khomp.kami.khompabstract.AbstractAlarmClear;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class AlarmClear extends AbstractAlarmClear implements InterfaceEvento{

    public AlarmClear(Object source) {
        super(source);
    }
    

    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento ALARM CLEAR ]");
        lista.add("Channel: "+this.getChannel());
        return lista;    
    }
}
