package aulas_1_temporada;

import java.util.Scanner;

public class Aula_17 {

    //Introdução a Strings

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Scanner(Aula 11) é o objeto que captura os dados inseridos pelo usuário;

        System.out.println("Qual o seu nome?");
        String nome = input.next();

        // ****.next() é o responsável pela coleta da dados do usuário;
        // Existe uma categoria para cada tipo de input, Ex: .next(); .nextInt(); .nextDouble(); ...

        String frase = "o orgulho cega a sabedoria";

        System.out.println(nome + " saiba que, " + frase);

        //String --> um objeto do tipo string

    }


}
