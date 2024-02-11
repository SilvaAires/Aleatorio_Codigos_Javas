package Lista_de_Exercicios_8;

import java.util.Scanner;

public class numero_1 {
    public static void main(String []args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Valor inteiro: " );
        int num = entrada.nextInt();
        int soma = 0;
        for(int i = 1; i <= num ; i++){
            soma = soma + i + num;
            System.out.println ("valor total: " + soma);
        }
    }
}
