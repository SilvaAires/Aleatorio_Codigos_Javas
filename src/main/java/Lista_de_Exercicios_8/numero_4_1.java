package Lista_de_Exercicios_8;

import java.util.Scanner;

public class numero_4_1 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int maior=0;
        int menor=0;
        for (int i = 0; i <= 5; i++){
            System.out.print("Digite o " +(i+1)+ "º valor: ");
            int valor = entrada.nextInt();
            if (valor > maior){
                maior = valor;
            }
        }
        for (int j = 0; j <= 5; j++){
            System.out.print("Digite o " +(j+1)+ "º valor: ");
            int num = entrada.nextInt();
            if (num > menor){
                menor = num;
            }
        }
        System.out.println("Maior valor = "+ maior);
	System.out.println("Menor valor = "+ menor);
    }
}
