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
public class TElementoABTest {

    public TElementoABTest() {
    }

    @Test
    public void testArbolVacio() {
        TArbolBB arbol = new TArbolBB();

        String exp = "";

        assertEquals(exp, arbol.inOrden());
    }

    @Test
    public void testArbolRandom() {
        TArbolBB arbol = new TArbolBB();
        arbol.insertar(new TElementoAB(50, -1));
        arbol.insertar(new TElementoAB(2, -1));
        arbol.insertar(new TElementoAB(14, -1));
        
        String exp = "2\n14\n50\n";

        assertEquals(exp, arbol.inOrden());
    }

    @Test
    public void testSoloUnElem() {
        TArbolBB arbol = new TArbolBB();
        arbol.insertar(new TElementoAB(50, -1));
        
        String exp = "50\n";

        assertEquals(exp, arbol.inOrden());
    }
    
    @Test
    public void testAlturaArbolVacio() {
        TArbolBB arbol = new TArbolBB();

        int expected = 0;
        assertEquals(arbol.obtenerAltura(), expected);
    }
    
    @Test
    public void testAlturaArbol1Elem() {
        TArbolBB arbol = new TArbolBB();
        
        arbol.insertar(new TElementoAB(2, 123));

        int expected = 1;
        assertEquals(arbol.obtenerAltura(), expected);
    }
    
    @Test
    public void testAlturaArbolAltura3() {
        TArbolBB arbol = new TArbolBB();
        
        arbol.insertar(new TElementoAB(2, 123));
        arbol.insertar(new TElementoAB(1, 123));
        arbol.insertar(new TElementoAB(3, 123));
        arbol.insertar(new TElementoAB(4, 123));

        int expected = 3;
        assertEquals(arbol.obtenerAltura(), expected);
    }
}
