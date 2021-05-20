/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author CES
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of sumarPar method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testSumarPar() {
        System.out.println("sumarPar");
        Operaciones instance = new Operaciones();
        int a = 2;
        int b = 2;
        int expResult = 4;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sumarPar method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testSumarImpar() {
        System.out.println("sumarImpar");
        Operaciones instance = new Operaciones();
        int a = 3;
        int b = 2;
        int expResult = 6;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of mayor method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testMayorA() {
        System.out.println("mayor A");
        Operaciones instance = new Operaciones();
        int a = 3;
        int b = 2;
        int expResult = 3;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mayor method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testMayorB() {
        System.out.println("mayor B");
        int a = 2;
        int b = 3;
        Operaciones instance = new Operaciones();
        int expResult = 3;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mayor method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testIgual() {
        System.out.println("Igual");
        int a = 3;
        int b = 3;
        Operaciones instance = new Operaciones();
        int expResult = 3;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of sumarVector method, of class Operaciones.
     */
    
    @Test
    public void testSumarVector() {
        System.out.println("sumarVector");
        int[] numeros = {1, 2, 4};
        Operaciones instance = new Operaciones();
        int expResult = 7;
        int result = instance.sumarVector(numeros);
        assertEquals(expResult, result);
    }
    
}
