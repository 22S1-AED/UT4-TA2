/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut4ta2;

/**
 *
 * @author rodri
 */
public class UT4TA2 {

    public static void main(String[] args) {
        String nombreArchivo = "claves2";
        String[] elementos = ManejadorArchivosGenerico.leerArchivo(nombreArchivo + ".txt");
        String[] lineasAEscribir = new String[elementos.length];
        TArbolBB arbol = new TArbolBB();
        for (int i = 0; i < elementos.length; i++) {
            TElementoAB elemento = new TElementoAB(elementos[i]);
            if (arbol.insertar(elemento)) {
                lineasAEscribir[i] = elementos[i] + ", contador = " + TArbolBB.contadorInsertar;
            }
            else {
                lineasAEscribir[i] = elementos[i] + ", contador = 0";
            }
        }
        ManejadorArchivosGenerico.escribirArchivo(nombreArchivo + "_insercion.txt", lineasAEscribir);
    }
}
