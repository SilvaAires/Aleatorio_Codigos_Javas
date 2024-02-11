/*
11. Desenvolva um programa que leia 10 salários, armazene
num vetor (double) e depois percorra esse vetor
identificando qual o índice do maior salário.

 */
package Programação1;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        double salario[] = new double[3];
        for (int i = 0; i < salario.length; i ++){
            System.out.println("Digite os salarios: ");
            salario[i] = e.nextDouble();
        }
        int ind = 0;
        double maior = 0;
        for (int i = 0; i < salario.length; i ++){
            System.out.println("Êlemento "+i+", salario: " +salario[i]);
            if (salario[i] > maior){
                maior = salario[i];
                ind = i;
            }
        }
        System.out.println("O salario maior é " + maior+ " e sua posicao é " +ind);
    }
}
