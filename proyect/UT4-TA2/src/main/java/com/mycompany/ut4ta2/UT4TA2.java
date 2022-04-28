/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut4ta2;

import static ut5.ta2.ManejadorArchivosGenerico.leerArchivo;

/**
 *
 * @author rodri
 */
public class UT4TA2 {

    public static void main(String[] args) {
        String[] consultas = leerArchivo("src/consultaPrueba.txt");
        System.out.println(consultas.length);
    }
}
