package aulas_1_temporada;

import java.util.Scanner;

public class Aula_18 {

    // Esturtura IF ELSE

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Por Favor insira a seu nome: ");
        String nome = input.nextLine();

        // .next() --> faz a leitura de dados apenas de palavras isoladas(para na primeira quebra de palavra);
        // .nextLine() --> faz a leitura de dados de um linha inteira(para na primeira quebra de linha);


        System.out.print("Por Favor insira a sua idade: ");
        int idade = input.nextInt();

        if (idade >= 18) {

            System.out.println("Parabéns, " + nome + " vôce já pode ser preso!!!!!!!!!");

        } else {

            System.out.println("Ainda é de menor, que pena :| ");

        }


    }


}
