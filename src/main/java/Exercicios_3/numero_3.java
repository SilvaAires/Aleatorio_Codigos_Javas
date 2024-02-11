package Exercicios_3;

import java.util.Scanner;

public class numero_3 {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("distPerc: ");
        double distPerc = entrada.nextDouble();
        System.out.print("quantComb: ");
        double quantComb = entrada.nextDouble();
        double consMedio = distPerc/quantComb;
        System.out.print("consMedio: " + consMedio);
    }
}
