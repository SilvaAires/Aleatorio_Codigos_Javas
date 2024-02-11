/*
13. Faça um programa que leia as temperaturas médias
ocorridas em cada mês no período de um ano e armazene
em um vetor. A seguir escreva qual mês teve a menor
média de temperatura e qual teve a maior média de
temperatura.
 */
package Programação1;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String []args){
        double temp[] = new double [12];
        double maior = 0;
        double menor = 0;
        for (int i = 0; i < temp.length; i++){
            Scanner e = new Scanner(System.in);
            System.out.println("Digite as temperatura: ");
            temp[i] = e.nextDouble();
        }
        for (int i = 0; i < temp.length; i++){
            if (temp[i] > maior){
                maior = temp[i];
            }
            if (temp[i] < menor){
                menor = temp[i];
            }
        }
        for (int i = 0; i < temp.length; i++){
            if (temp[i] == maior){
                System.out.println("O mes " +(1+i)+ "teve a maior temperatura do ano que foi "+temp[i]);
            }
            if (temp[i] == menor){
                System.out.println("O mes " +(1+i)+ "teve a menor temperatura do ano que foi "+temp[i]);
            }
        }
    }
}
