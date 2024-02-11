package Lista_de_Exercicios_7;

import java.util.Scanner;

public class numero_1 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor inteiro entre 1 e 10: ");
        int num = entrada.nextInt();
        for (int i = 0; i <= 10; i++){
            int vezes = num * i;
            System.out.println(num + " X " + i + " = " + vezes);
        }
    }
}
