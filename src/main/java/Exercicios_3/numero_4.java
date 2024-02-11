package Exercicios_3;

import java.util.Scanner;

public class numero_4 {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("anoNasc: ");
        int anoNasc = entrada.nextInt();
        int idade = 2022 - anoNasc;
        System.out.print("idade:" + idade);
    }
}
