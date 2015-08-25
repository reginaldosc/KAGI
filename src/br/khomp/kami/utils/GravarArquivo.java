/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.utils;

import java.io.FileWriter;  
import java.io.IOException;  
import java.io.PrintWriter;  
  
public class GravarArquivo {  
  
    public void gravar(String text) {   
        
        final int TAM_MIN = 4;
        
        if (text.length() < TAM_MIN) {
            System.out.println("vazio");            
        
        }else {
            try {
                try (FileWriter arq = new FileWriter("KAMI_log.txt")) {
                    PrintWriter gravarArq = new PrintWriter(arq);
                    gravarArq.printf(text);
                }
            } catch (IOException e) {
                System.out.println("Erro ao criar o arquivo");
            } catch (SecurityException securityException) {
                System.err.println("Você não tem permissão de escrita nesse arquivo");
                System.exit(1);
            } finally {
                System.out.printf("Arquivo gravado com sucesso");
            }
            
        }
    }  
}  
