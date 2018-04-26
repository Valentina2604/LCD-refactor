/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psl.lcdrefactor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Valentina
 */
public class impresoraLCDIT {
    
    public impresoraLCDIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of procesar method, of class impresoraLCD.
     */
    @Test
    public void testProcesar() {
        System.out.println("procesar");
        String comando = "";
        int espacioDig = 0;
        impresoraLCD instance = new impresoraLCD();
        instance.procesar(comando, espacioDig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNumeric method, of class impresoraLCD.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String cadena = "";
        boolean expResult = false;
        boolean result = impresoraLCD.isNumeric(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
