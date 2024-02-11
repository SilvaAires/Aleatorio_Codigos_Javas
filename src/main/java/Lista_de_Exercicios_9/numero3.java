package Lista_de_Exercicios_9;

import java.util.Scanner;

public class numero3 {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.println ("Digite um número natural maior que 1: ");
        int num = entrada.nextInt();
        if (num > 1){
            int j = 0;
            for (int i = 1; i <= num; i ++){
                int resto = num % i;
                int quociente = num / i;
                if (resto == 0 ){
                    System.out.println ("É par");
                }
                else{
                    if (resto != 0){
                    System.out.println("É impar");
                    j = 1 + 1 ;
                    }
                }
            }
            System.out.println ("Número de divisores: " + j);
        }
        else{
            System.out.println("Numero deve ser maior que 1");
        }
    }
}
