/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edu.netbeans.calculadora;

/**
 *
 * @author brian
 */
public class Calculadora {

    public static void main(String[] args) {
        Operaciones  op = new Operaciones();
        op.leerNumeros();
        op.sumar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
    }
}
