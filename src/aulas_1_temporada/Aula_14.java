package aulas_1_temporada;

import java.util.Scanner;

public class Aula_14 {

    //conteudo: operar com o resto = "%"

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int x = 14 % 5;
        System.out.println(x); //opera com o resto da divisão
        int y = 10 % 5;
        int z = 5 % 5;
        int a = 1 % 5;

        //Exemplo de utilização:
        System.out.println("Insira um valor em gramas:");
        int gramas  = leia.nextInt();

        int kilos = gramas / 1000;
        gramas = gramas % 1000;

        System.out.println("Total de kilos :" + kilos);
        System.out.println("Total de gramas :" + gramas);

    }



}
