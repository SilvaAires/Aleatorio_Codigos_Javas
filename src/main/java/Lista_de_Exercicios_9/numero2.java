package Lista_de_Exercicios_9;

import java.util.Scanner;

public class numero2 {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        int candidato_1 = 0;
        int candidato_2 = 0;
        int candidato_3 = 0;
        int voto_em_Branco = 0;
        int voto_Nulo = 0; 
        int i = 1;
        while ( i <= 10){
            System.out.println("Urna");
            System.out.println("Candidato 1");
            System.out.println("Candidato 2");
            System.out.println("Candidato 3");
            System.out.println("Voto em branco");
            System.out.println("Voto nulo");
            System.out.print("Escolha uma operação: ");
            int op = entrada.nextInt();
            switch (op){
                case 1: System.out.println("Candidato 1");
                candidato_1 = candidato_1 + 1;
                break;
                case 2: System.out.println("Candidato 2");
                candidato_2 = candidato_2 + 1;
                break;
                case 3: System.out.println("Candidato 3");
                candidato_3 = candidato_3 + 1;
                break;
                case 4: System.out.println("Voto em branco");
                voto_em_Branco = voto_em_Branco + 1;
                break;
                case 5: System.out.println("Voto nulo");
                voto_Nulo = voto_Nulo + 1;
                break;
                default: System.out.println("Operação Inválida!");
            }
        }
        System.out.println("Total de votos");
        System.out.println("Candidato 1, total: " + candidato_1);
        System.out.println("Candidato 2, total: " + candidato_2);
        System.out.println("Candidato 3, total: " + candidato_3);
        System.out.println("Voto em branco, total; " + voto_em_Branco);
        System.out.println("Voto nulo, total: " + voto_Nulo);
    }
}
