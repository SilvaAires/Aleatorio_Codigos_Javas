/*
Escreva um algoritmo que leia os valores para um vetor de 10
elementos e então mostre na tela a quantidade de números pares e
ímpares.
 */
package Programação1;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        int impar = 0;
        int par = 0;
        double vetor [] = new double [10];
        for (int i = 0; i < vetor.length; i ++){
            System.out.println("Digite um numero pra armazenar: ");
            vetor[i] = e.nextDouble();
        }
        for (int i = 0; i < vetor.length; i ++){
            System.out.println("Elemento "+(1+i)+" : " + vetor[i]);
            if ((vetor[i]%2) == 0 ){
                par++;
            }
            else{
                if ((vetor[i]%2)!= 0 ){
                    impar++;
                }
            }
        }
        System.out.println("Quantidade de impares = " + impar + ", e de pares = " + par);
    }
}
