package Lista_de_Exercicios_7;

public class numero_2 {
    public static void main (String args[]){
        for (int i = 1; i <= 100; i ++){
            int multiplo = i % 8;
            if (multiplo == 0){
                System.out.println(i + " E multiplo de 8");
            }
        }
    }
}
