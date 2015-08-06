/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kagi.reginaldo.controle;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;

/**
 *
 * @author Reginaldo
 */
public class AplicacaoTest extends TestCase {
    
    public AplicacaoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of consultaSaldo method, of class Aplicacao.
     */
    public void testConnection() {
        System.out.println("Teste de Login");
        Aplicacao instance = new Aplicacao();
        try {
            instance.onConnect();
        } catch (IOException ex) {
            Logger.getLogger(AplicacaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO review the generated test code and remove the default onCall to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of efetuaMovimentacao method, of class Aplicacao.
     */
    public void testEfetuaMovimentacao() {
        System.out.println("efetuaMovimentacao");
        Aplicacao instance = new Aplicacao();
       // instance.efetuaMovimentacao();
        // TODO review the generated test code and remove the default onCall to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sobre method, of class Aplicacao.
     */
    public void testSobre() {
        System.out.println("sobre");
        Aplicacao instance = new Aplicacao();
        instance.sobre();
        // TODO review the generated test code and remove the default onCall to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of teste method, of class Aplicacao.
     */
    public void testTeste() {
        System.out.println("teste");
        String teste = "";
        Aplicacao instance = new Aplicacao();
        instance.teste(teste);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onConnect method, of class Aplicacao.
     */
    public void testOnConnect() throws Exception {
        System.out.println("onConnect");
        Aplicacao instance = new Aplicacao();
        boolean expResult = false;
        boolean result = instance.onConnect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onDisconnect method, of class Aplicacao.
     */
    public void testOnDisconnect() {
        System.out.println("onDisconnect");
        Aplicacao instance = new Aplicacao();
        instance.onDisconnect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendPing method, of class Aplicacao.
     */
    public void testSendPing() {
        System.out.println("sendPing");
        Aplicacao instance = new Aplicacao();
        boolean expResult = false;
        boolean result = instance.sendPing();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onCall method, of class Aplicacao.
     */
    public void testOnCall() {
        System.out.println("onCall");
        Aplicacao instance = new Aplicacao();
        boolean expResult = false;
        boolean result = instance.onCall();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hangUp method, of class Aplicacao.
     */
    public void testHangUp() {
        System.out.println("hangUp");
        Aplicacao instance = new Aplicacao();
        instance.hangUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cbSMSischanged method, of class Aplicacao.
     */
    public void testCbSMSischanged() {
        System.out.println("cbSMSischanged");
        Aplicacao instance = new Aplicacao();
        instance.cbSMSischanged();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendSms method, of class Aplicacao.
     */
    public void testSendSms() {
        System.out.println("sendSms");
        Aplicacao instance = new Aplicacao();
        instance.sendSms();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeInfo method, of class Aplicacao.
     */
    public void testChangeInfo() {
        System.out.println("changeInfo");
        String text = "";
        Aplicacao instance = new Aplicacao();
        instance.changeInfo(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
