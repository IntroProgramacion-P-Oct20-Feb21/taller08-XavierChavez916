/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller008;

/**
 *
 * @author xavierchavez
 */
public class Problema01 {

    public static void main(String[] args) {

        String palabra = "Universidad";
        char letra;

        for (int i = 0; i < palabra.length(); i++) {
            for (int contador = 0; contador <= i; contador++) {
                letra = palabra.charAt(i);
                System.out.printf("%s", letra);
            }
            System.out.println("");
        }
    }

}
