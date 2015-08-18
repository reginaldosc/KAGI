/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.evento;

import br.khomp.kami.khompabstract.AbstractNewUSSD;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khomp
 */
public class NewUSSD extends AbstractNewUSSD implements InterfaceEvento{

    public NewUSSD(Object source) {
        super(source);
    }

    @Override
    public List<String> getAll() {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("\n[ Evento NEW USSD ]");
        lista.add("Channel: "+this.getChannel());
        lista.add("Message: "+this.getMessage());
        return lista;            
    }
}
