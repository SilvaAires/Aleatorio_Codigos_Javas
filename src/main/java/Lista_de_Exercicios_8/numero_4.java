package Lista_de_Exercicios_8;

import java.util.Scanner;

public class numero_4 {
    public static void main (String args[]){
        double fora = 0;
        for (int i = 1; i <= 5; i ++){
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite um valor: ");
            double valor = entrada.nextDouble();
            if ( fora > valor ){
                System.out.println("O valor é inferior");
            }
            else{
                if (fora < valor){
                    System.out.println("O valor é superior");
                    fora = valor;
                }
            }
        }
    }
}
