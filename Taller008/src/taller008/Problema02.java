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
public class Problema02 {

    public static void main(String[] args) {

        char valor;

        for (int i = 1; i <= 26; i++) {
            for (int contador = 1; contador <= i; contador++) {
                valor = (char) (i + 96);

                System.out.printf("%s", valor);
            }
             System.out.println("");

        }
       
    }

}
