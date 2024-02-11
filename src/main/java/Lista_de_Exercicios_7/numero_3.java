package Lista_de_Exercicios_7;

import java.util.Scanner;

public class numero_3 {
    public static void main(String args[]){
        for (int i = 1; i <= 10; i++){
           Scanner entrada = new Scanner(System.in);
           System.out.print("Informe 10 numeros inteiros positivos: ");
           int num = entrada.nextInt();
           int resto = num % 2;
           if (resto == 0){
               System.out.println("O numero e par");
           }
           else{
               System.out.println("O numero e impar");
           }
        }
    }
}
