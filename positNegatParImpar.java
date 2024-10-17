import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;


        for (int i = 1; i <= 5; i++) {
            int valor = s.nextInt();

            if (valor % 2 == 0) {
                Pares++;
            } else {
                impares++;
            } if(valor > 0){
                positivos++;
            }else if(valor < 0){
                negativos++;
            }
        }

        System.out.println(Pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

    }
}