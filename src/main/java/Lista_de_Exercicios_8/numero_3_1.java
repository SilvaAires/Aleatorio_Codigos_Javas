package Lista_de_Exercicios_8;

import java.util.Scanner;

public class numero_3_1 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um um valor inteiro e positivo: ");
        int num = entrada.nextInt();
        int a = 1;
        for (int i = 1; i <= num; i++){
            a = num * a;
        }
        System.out.println("Resultado: " + a);
    }
}
