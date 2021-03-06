/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4ta2;

/**
 *
 * @author rodri
 */
public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;
    private int contador;

    public TArbolBB() {
        raiz = null;
    }

    @Override
    public boolean insertar(TElementoAB unElemento) {
        this.contador = 0;

        if (raiz == null) {
            raiz = unElemento;
            return true;
        } else {
            boolean insertarOk = raiz.insertar(unElemento);
            this.contador = raiz.getContador();
            return insertarOk;
        }
    }

    @Override
    public TElementoAB buscar(Comparable unaEtiqueta) {
        int[] dummyCont = new int[]{0};
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
        return this.raiz.preOrden();
    }

    @Override
    public String inOrden() {
        if (esVacio()) {
            return "";
        } else {
            return this.raiz.inOrden();
        }
    }

    @Override
    public String postOrden() {
        return this.raiz.postOrden();
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if (this.raiz != null)
            this.raiz = this.raiz.eliminar(unaEtiqueta);
    }

    public boolean esVacio() {
        return raiz == null;
    }

    public int getContador() {
        return this.contador;
    }

    @Override
    public int obtenerTamaño() {
        if (this.raiz != null) {
            return raiz.obtenerTamaño();
        } else {
            return 0;
        }
    }

    /**
     * Retorna la altura del arbol
     * Por convencion, un arbol vacio tiene altura 0, y un arbol
     * con un elemento tiene altura 1.
     * @return 
     */
    @Override
    public int obtenerAltura() {
       if (this.raiz == null)
            return 0;
        
        return this.raiz.obtenerAltura();
    }

}
