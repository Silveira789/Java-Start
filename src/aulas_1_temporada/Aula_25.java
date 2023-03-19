package aulas_1_temporada;

import java.util.Scanner;
import java.util.Random;


public class Aula_25 {

    //Jogo acerte o numero

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        boolean acertou = false;
        int tentativas = 5;
        int numeroSecreto = aleatorio.nextInt(30);
        long chute = 0;



            System.out.println("Bem vindo ao jogo: adivinhe o número \n Um número aleatório foi escolhido por mim e você tem 3 chances para adivinha-lo.");
            System.out.println("*Número entre 0 e 30");


        while ((tentativas > 0) && (acertou == false)) {

            System.out.println("Qual seu chute?");
            chute = input.nextLong();

            if (chute == numeroSecreto) {

                System.out.println("Você acertou!!!");
                acertou = true;

            } else if (chute < numeroSecreto) {

                System.out.println("Número muito pequeno! ");
                --tentativas;
                System.out.println("tentativas restantes: " + tentativas);

            } else {

                System.out.println("Numero muito grande! ");
                --tentativas;
                System.out.println("tentativas restantes: " + tentativas);


            }


        }

        System.out.println("Numero era: " + numeroSecreto);








/*
        Esboço inicial

        int num;
        int random = 7;
        int palpite = 1;

        System.out.println("Bem vindo ao jogo: adivinhe o número \n Um número aleatório foi escolhido por mim e você tem 3 chances para adivinha-lo.");
        System.out.println("*Número entre 0 e 30");


        for (; palpite <= 3; palpite++) {

            System.out.print("Palpite n° " + palpite + " : ");
            num = input.nextInt();

            if (num == random) {

                System.out.println("Parabéns, você acertou");

            }else{
                System.out.println("Errou!!!!!!");
            }

        }

        System.out.println("Número escolhido: "+ random);

 */
    }


}
