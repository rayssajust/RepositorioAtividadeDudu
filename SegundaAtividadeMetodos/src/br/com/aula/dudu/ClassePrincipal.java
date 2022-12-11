/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.aula.dudu;

import javax.swing.JOptionPane;

/**
 *
 * @author Rayssa-PC
 */
public class ClassePrincipal {

    static double calcularSoma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    static double calcularSubtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }

    static double calcularDivisao(double valor1, double valor2) {
        return valor1 / valor2;
    }

    static double calcularMultiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }
    static void calculaTudo (Double valor1, Double valor2) {
        mostrarMensagem("A soma de " +valor1 +" e "+valor2+" é igual " + calcularSoma(valor1,valor2));
        mostrarMensagem("A subtracao de " +valor1 +" e "+valor2+" é igual " + calcularSubtracao(valor1,valor2));
        mostrarMensagem("A divisao de " +valor1 +" e "+valor2+" é igual " + calcularDivisao(valor1,valor2));
        mostrarMensagem("A multiplicacao de  " +valor1 +" e "+valor2+" é igual " + calcularMultiplicacao(valor1,valor2));
    }
            
    public static void main(String[] args) {
        calculaTudo (5.0, 2.0);

    }

    private static void mostrarMensagem(String string) {
        JOptionPane.showMessageDialog(null, string);

    }
}
