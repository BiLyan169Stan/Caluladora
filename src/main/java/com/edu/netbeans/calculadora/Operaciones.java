/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.netbeans.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author brian
 */
public class Operaciones {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Coloca el numero 1: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Coloca el numero 2: "));
        System.out.println("");
    }
    
    public void sumar(){
        suma=numero1+numero2;
    }
    
    public void resta(){
        resta=numero1-numero2;
    }
    
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    
    public void dividir(){
        division=numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("a multiplicacion es:"+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
