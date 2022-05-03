/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4ta2;

/**
 *
 * @author rodri
 */
class TElementoAB<T> implements IElementoAB<T>{
    private Comparable etiqueta;
    private TElementoAB<T> hijoIzq;
    private TElementoAB<T> hijoDer;
    private T dato;
    private int contadorInt;
    
    public TElementoAB(Comparable etiqueta) {
        this.etiqueta = etiqueta;
    }
    

    public TElementoAB(Comparable etiqueta, T dato) {
        this.etiqueta = etiqueta;
        this.dato = dato;
    }
    
    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        int[] dummyCont = new int[] {0};
        TElementoAB<T> elemento = this.buscar(unaEtiqueta, dummyCont);
        this.contadorInt = dummyCont[0];
        return elemento;
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
        int[] contador = new int[] {0};
        boolean insertarOk = this.insertar(elemento, contador);
        this.contadorInt = contador[0];
        return insertarOk;
    }

    public boolean insertar(TElementoAB<T> elemento, int[] contador) {
        contador[0]++;
        if (this.etiqueta.compareTo(elemento.etiqueta) == 0) {
            return false;
        }
        else if (this.etiqueta.compareTo(elemento.etiqueta) < 0) {
            if (this.hijoDer == null) {
                this.hijoDer = elemento;
                return true;
            }
            else {
                return this.hijoDer.insertar(elemento, contador);
            }
        }
        else {
            if (this.hijoIzq == null) {
                this.hijoIzq = elemento;
                return true;
            }
            else {
                return this.hijoIzq.insertar(elemento, contador);
            }
        }
    }

    @Override
    public String preOrden() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.etiqueta + "\n");
        if (this.hijoIzq != null)
            sb.append(this.hijoIzq.preOrden());
        if (this.hijoDer != null)
            sb.append(this.hijoDer.preOrden());
        return sb.toString();
    }

    @Override
    public String inOrden() {
        StringBuilder sb = new StringBuilder();
        if (this.hijoIzq != null)
            sb.append(this.hijoIzq.preOrden());
        sb.append(this.etiqueta + "\n");
        if (this.hijoDer != null)
            sb.append(this.hijoDer.preOrden());
        return sb.toString();
    }

    @Override
    public String postOrden() {
        StringBuilder sb = new StringBuilder();
        if (this.hijoIzq != null)
            sb.append(this.hijoIzq.preOrden());
        if (this.hijoDer != null)
            sb.append(this.hijoDer.preOrden());
        sb.append(this.etiqueta + "\n");
        return sb.toString();
    }

    @Override
    public T getDatos() {
        return this.dato;
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getContador() {
        return this.contadorInt;
    }

    @Override
    public int obtenerTamaño() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int obtenerAltura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
