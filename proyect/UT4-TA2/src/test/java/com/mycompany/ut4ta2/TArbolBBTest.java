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

        assertEquals(exp, arbol.obtenerTamaño());
    }
    
    @Test
    public void testEliminar(){
        TArbolBB arbol = new TArbolBB();
        arbol.insertar(new TElementoAB(12, -1));
        arbol.insertar(new TElementoAB(25, -1));
        arbol.insertar(new TElementoAB(14, -1));
        arbol.insertar(new TElementoAB(1, -1));
        arbol.insertar(new TElementoAB(33, -1));
        arbol.insertar(new TElementoAB(88, -1));
        arbol.insertar(new TElementoAB(45, -1));
        arbol.insertar(new TElementoAB(2, -1));
        arbol.insertar(new TElementoAB(7, -1));
        arbol.insertar(new TElementoAB(66, -1));
        arbol.insertar(new TElementoAB(5, -1));
        arbol.insertar(new TElementoAB(99, -1));
        
        System.out.println(arbol.inOrden());
        
        arbol.eliminar(99);
        arbol.eliminar(15);
        arbol.eliminar(2);
        arbol.eliminar(12);
        arbol.eliminar(77);
        arbol.eliminar(33);
        
        System.out.println(arbol.inOrden());
        System.out.println(arbol.postOrden());
        System.out.println(arbol.preOrden());
        String exp = "1\n5\n7\n14\n25\n44\n66\n88\n";
        
        assertEquals(exp,arbol.inOrden());
        exp = "5\n1\n14\n66\n45\n88\n25\n7\n";
        assertEquals(exp,arbol.postOrden());
        exp = "7\n1\n5\n25\n14\n88\n45\n66\n";
        assertEquals(exp,arbol.preOrden());
    }
}