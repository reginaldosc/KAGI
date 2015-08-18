/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.evento;

import br.khomp.kami.khompabstract.AbstractAlarm;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class Alarm extends AbstractAlarm implements InterfaceEvento{

    public Alarm(Object source) {
        super(source);
    }
        
    
    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento ALARM ]");
        lista.add("Channel: "+this.getChannel());
        lista.add("Alarm: "+this.getAlarm());
        return lista;
    }
}
