/*
• DESAFIO: Escreva um algoritmo que leia os valores para
um vetor de 10 elementos, e em seguida ordene em
ordem crescente os valores desse vetor
 */
package Programação1;

import java.util.Scanner;

public class Desafio {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        int num[]=new int[5];
        int aux = 0;
        for (int i=0; i<num.length; i++){
            System.out.println("Digite os numeros: ");
            num[i] = e.nextInt();
        }
        System.out.println(" ");
        for (int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
        System.out.println(" ");
        for (int i=0; i<num.length; i++){
            for (int j=0; j<num.length; j++){
                if(num[i]<num[j]){
                    aux = num[i];
                    num[i]=num[j];
                    num[j]=aux;
                }
            }
        }
        System.out.println(" ");
        for (int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}
