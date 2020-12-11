/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller008;

import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        double suma = 0;
        double numerador = 1;
        double denominador;

        System.out.println("Ingrese el valor de n");
        n = entrada.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {

                denominador = Math.pow(2, i);
                suma = suma + (numerador / denominador);

            }

        } else {
            System.out.println("Ingrese un numero positivo");
        }

        System.out.printf("Valor de la sumatoria: %.4f\n", suma);

    }
}
