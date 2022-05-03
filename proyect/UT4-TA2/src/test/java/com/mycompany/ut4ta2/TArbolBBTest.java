/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ut4ta2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SebaFripp
 */
public class TArbolBBTest {
    
    public TArbolBBTest() {
    }

    @Test
    public void testTamaño0() {
        TArbolBB arbol = new TArbolBB();
        
        int exp = 0;
        
       assertEquals(exp, arbol.obtenerTamaño());
    }
    
    @Test
    public void testTamaño1() {
        TArbolBB arbol = new TArbolBB();
        arbol.insertar(new TElementoAB(3, -1));
        
        int exp = 1;
        
       assertEquals(exp, arbol.obtenerTamaño());
    }
    
    @Test
    public void testArbolRandom() {
        TArbolBB arbol = new TArbolBB();
        arbol.insertar(new TElementoAB(50, -1));
        arbol.insertar(new TElementoAB(2, -1));
        arbol.insertar(new TElementoAB(14, -1));
        
        int exp = 3;

        assertEquals(exp, arbol.inOrden());
    }
}