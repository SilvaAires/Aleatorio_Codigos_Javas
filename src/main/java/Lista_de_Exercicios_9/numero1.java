package Lista_de_Exercicios_9;

import java.util.Scanner;

public class numero1 {
    public static void main(String []args){
        Scanner entrada = new Scanner (System.in);
        int maior_que_zero = 0;
        int menor_que_zero = 0;
        int igual_a_zero = 0;
        int i = 1;
        while ( i <= 10){
            System.out.print("Digite 10 números inteiros: ");
            int num = entrada.nextInt();
            if ( num > 0 ){
                maior_que_zero = maior_que_zero + 1;
            }
            else{
                if ( num < 0 ){
                    menor_que_zero = menor_que_zero + 1;
                }
                else{
                    if ( num == 0 ){
                        igual_a_zero = igual_a_zero + 1;
                    }
                }
            }
            i ++;
        }
        System.out.println("Quantos numeros maior que zero" + maior_que_zero);
        System.out.println("Quantos numeros menor que zero" + menor_que_zero);
        System.out.println("Quantos numeros igual zero" + igual_a_zero);
    }
}
