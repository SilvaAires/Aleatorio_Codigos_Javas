/*
 7. Faça um programa que armazene em um vetor de inteiros as
quantidades compradas de 5 produtos. Em outro vetor de reais,
armazene o valor unitário de cada produto. O programa deve, ao
final, mostrar o valor total a ser pago por cada produto. Considere
que o índice do vetor corresponde ao código do produto
 */
package Programação1;

import java.util.Scanner;

public class exercicio_07 {
    public static void main (String []args){
        int vetor1 [] = new int [2];
        double vetor2 [] = new double [vetor1.length];
        double vetor3 [] = new double [vetor1.length];
        for (int i = 0; i < vetor1.length; i++){
            Scanner e = new Scanner (System.in);
            System.out.println("Digite a quantidade comprada do " +i+ " : ");
            vetor1[i] = e.nextInt();
            System.out.println("Digite a valor da comprada do " +i+ " : ");
            vetor2[i] = e.nextDouble();
        }
        for (int i = 0; i < vetor1.length; i++){
            vetor3[i] = vetor1[i]*vetor2[i];
        }
        for (int i = 0; i < vetor1.length; i++){
            System.out.println("Valor total do item " +i+ " : " + vetor3[i]);
        }
    }
}
