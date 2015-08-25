/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.utils;

/**
 *
 * @author Reginaldo
 */
public class kLogs {

    public final String ALL_LOG                 = "all";
    public final String NIVEL_SINAL_ANTENA_LOG  = "[ Evento ANTENNA LEVEL ]";
    public final String EVENT_LOG               = "evento";
    public final String COMMAND_LOG             = "[ Comando Originate ]";
    
    private String log;

    public void montaLogs(String opt) {

        switch (opt) {
            case ALL_LOG:
                System.out.println("todos logs habilitados.");
                
                break;
            case NIVEL_SINAL_ANTENA_LOG:
                System.out.println("Sinal antena habilitado.");
                break;
            case EVENT_LOG:
                System.out.println("eventos habilitados.");
                break;
            case COMMAND_LOG:
                System.out.println("comandos habilitados.");
                break;
        }
    }

    /**
     * @return the log
     */
    public String getLog() {
        return this.log;
    }

    /**
     * @param log the log to set
     */
    public void setLog(String log) {
        System.out.println(log);
        this.log = log;
    }
}
