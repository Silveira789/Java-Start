package aulas_1_temporada;

import java.util.Scanner;

public class Aula_20 {

    // OPERADORES LÓGICOS "&&" E "||"

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int met1;
        int met2;

        System.out.println("Descobrir se o numero é par ou impar");
        System.out.println("Insira o numero: ");
        double numero = input.nextDouble();


        //Maneira de resolução n° 1
        System.out.println("Método 1: ");
        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        //Maneira de resolução n° 2
        System.out.println("Método 2: ");
        if (numero % 2 != 0) {

            System.out.println("IMPAR");
        } else {
            System.out.println("PAR");
        }

        System.out.println("Entendeu os dois métodos? 0 = não e 1 = sim");

        met1 = input.nextInt();
        met2 = input.nextInt();

        if ((met1 == 1) && (met2 == 1)) {

            System.out.println("Opa! entendeu tudo parabens!!");

        } else if ((met1 == 0) || (met2 == 0) ) {

            System.out.println("Tá no rumo, leia denovo");

        }





        /*
        != --> diferente
        == --> igual
        % --> operador restante, calcula o restante de uma operação


         */
    }


}
