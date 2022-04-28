/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4ta2;

/**
 *
 * @author rodri
 */
class TElementoAB<T> implements IElementoAB<T> {

    private TElementoAB Hijoizq;
    private TElementoAB Hijoder;
    private Comparable Etiqueta;
    private T Dato;

    public TElementoAB(Comparable etiqueta, T dato) {
        this.Hijoizq = null;
        this.Hijoder = null;
        this.Etiqueta = etiqueta;
        this.Dato = dato;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.Etiqueta;
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        return this.Hijoizq;
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        return this.Hijoder;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        int[] dummyCont = new int[] {0};
        return this.buscar(unaEtiqueta, dummyCont);
    }
    
    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta, int[] cont) {
        TElementoAB result = this;
        if (unaEtiqueta.compareTo(result.getEtiqueta()) == 0) {
            return result;
        } else if (unaEtiqueta.compareTo(result.getEtiqueta()) == -1) {
            if (result.getHijoIzq() != null) {
                cont[0]++;
                return buscar(result.getHijoIzq().getEtiqueta(), cont);
            }
        } else {
            if (result.getHijoDer() != null) {
                cont[0]++;
                return buscar(result.getHijoDer().getEtiqueta(), cont);
            }
        }
        return null;
    }

    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T getDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
