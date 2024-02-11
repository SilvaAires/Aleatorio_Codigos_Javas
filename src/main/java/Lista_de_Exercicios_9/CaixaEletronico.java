package Lista_de_Exercicios_9;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 0;
        boolean sair = false;
        while(sair == false){
            System.out.println("CAIXA ELETRÔNICO");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma operação: ");
            int op = entrada.nextInt();
            switch(op){
                case 1: System.out.println("SALDO: " + saldo);
                    break;
                case 2: 
                    System.out.print("Valor do Depósito: ");
                    double dep = entrada.nextDouble();
                    saldo = saldo + dep;
                    break;
                case 3: 
                    System.out.print("Valor do Saque: ");
                    double saque = entrada.nextDouble();
                    if (saque <= saldo){
                        saldo = saldo - saque;
                    }
                    else{
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 4: 
                    System.out.println("ENCERRANDO...");
                    sair = true;
                    break;
                default: System.out.println("Operação Inválida!");
            }
        }
    }
}
