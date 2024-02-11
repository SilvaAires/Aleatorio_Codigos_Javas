package Lista_de_Exercicios_8;

import java.util.Scanner;

public class numero_2 {
    public static void main(String args[]){
        int fora = 0;
        for (int i = 1; i <= 10; i ++){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite 10 valores inteiros: ");
            int num = entrada.nextInt();
            fora = fora + num;
        }
        int media_aritmetica = fora / 10;
        System.out.println("Resultado da média aritmética dos números digitados: " + media_aritmetica );
    }
}
