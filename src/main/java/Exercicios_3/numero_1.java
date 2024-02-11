package Exercicios_3;

import java.util.Scanner;

public class numero_1 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota1 : ");
        double nota1 = entrada.nextDouble();
        System.out.print("Nota2 : ");
        double nota2 = entrada.nextDouble();
        System.out.print("Nota3 : ");
        double nota3 = entrada.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;
        System.out.print("media: " + media);
    }
}
