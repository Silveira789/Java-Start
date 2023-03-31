package progetosTemplate.ListaAP1.Exercicio2;

public class Principal {
    //autor: Silveira
    //função: Faça um algoritmo que imprima todos os números finalizados com 0 ou 7, de uma sequência de 0 a 100.
    //data: 21/05/22
    //input: ;
    //output: ;


    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            if (i % 10 == 0) {
                System.out.println(i);

                if (i < 99) {
                    i = i + 7;
                    System.out.println(i);
                }

            }

        }


    }


}
