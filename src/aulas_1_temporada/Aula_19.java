package aulas_1_temporada;

import java.util.Scanner;

public class Aula_19 {

    //Estrutura IF ELSE  continuação

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Insira seu nome: ");
        String nome = input.next();

        System.out.print("Insira sua idade: ");
        int idade = input.nextInt();


        if (idade < 1) {

            System.out.println("idade inserida não é válida");

        } else if (idade < 1){

            System.out.println(nome + "é maior de idade");

        }else {

            System.out.println(nome + "é menor de idade");
        }

        if (idade == 99)
            System.out.println("caution, rare case.");

        // Neste caso é possivel utilizar If sem colchetes, desde que tenha APENAS UMA INSTRUÇÃO;
        //VANTAGEM: código bonito


        /*
        if (idade > 1) {

            if (idade > 18){

                System.out.println( nome +" é maior de idade");
            }
            else{
                System.out.println(nome + " é menor de idade");
            }

        }else {
            System.out.println("Idade informada não é válida");
        }


         */

    }

}
