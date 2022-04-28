/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4ta2;

/**
 *
 * @author rodri
 */
public class TArbolBB<T> implements IArbolBB {

    TElementoAB<T> raiz;

    public TArbolBB() {
        raiz = null;
    }

    @Override
    public boolean insertar(TElementoAB unElemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TElementoAB buscar(Comparable unaEtiqueta) {
        int[] dummyCont = new int[] {0};
        return this.buscar(unaEtiqueta, dummyCont);
    }
    
    public TElementoAB buscar(Comparable unaEtiqueta, int[] cont) {
        if (esVacio()) {
            return null;
        } else {
            cont[0]++;
            return raiz.buscar(unaEtiqueta, cont);
        }
    }

    @Override
    public String preOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String inOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String postOrden() {
        return "";
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean esVacio() {
        return raiz == null;
    }
    
}
