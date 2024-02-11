package Exercicios_3;

import java.util.Scanner;

public class numero_2 {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("numero 1: ");
        int num1 = entrada.nextInt();
        System.out.print("numero 2: ");
        int num2 = entrada.nextInt();
        int quociente = num1/num2;
        int resto = num1%num2;
        System.out.print("quociente: " + quociente);
        System.out.print("resto: " + resto);
    }
}
