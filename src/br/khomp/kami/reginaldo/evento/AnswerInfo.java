/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.reginaldo.evento;

import br.khomp.kami.reginaldo.khompabstract.AbstractAnswerInfo;
import br.khomp.kami.reginaldo.util.KAMI;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class AnswerInfo extends AbstractAnswerInfo implements InterfaceEvento{

    public AnswerInfo(Object source) {
        super(source);
    }
    
    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento ANSWER INFO ]");
        lista.add("Channel: "+this.getChannel());
        lista.add("Info: "+this.getInfo());
        return lista;            
    }
}
