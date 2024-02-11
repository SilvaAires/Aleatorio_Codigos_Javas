/*
 1. Criar um algoritmo que leia os elementos de uma matriz
inteira 3x3, a escreva na tela, e posteriormente escreva
somente seus elementos da diagonal principal.
 */
package Programação1_2;

import java.util.Scanner;

public class Exericicio_1 {
    public static void main(String[]args){
        Scanner e = new Scanner(System.in);
        int matriz [][] = new int [3][3];
        for (int l = 0; l < matriz.length; l ++){
            for (int c = 0; c <matriz[0].length; c++){
                System.out.println("Digite os numeros da linha "+l+" e coluna "+c+" : ");
                matriz[l][c] = e.nextInt();
            }
        }
        for (int l = 0; l < matriz.length; l ++){
            for (int c = 0; c <matriz[0].length; c++){
                System.out.println(matriz[l][c]);
            }
        }
        for (int l = 0; l < matriz.length; l ++){
            for (int c = 0; c <matriz[0].length; c++){
                if ((l == 0)&&(c == 0)){
                    System.out.println(matriz[0][0]);
                }
                else{
                    if ((l != 0)&&(c != 0)){
                        System.out.println(matriz[0][0]+3);
                    }
                }
            }
        }
/*
        for (int l = 0; l < matriz.length; l = l+2){
            for (int c = 0; c <matriz[0].length; c = c+2){
                System.out.println(matriz[l][c]);
            }
        }
        */
    }
}
