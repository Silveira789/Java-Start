package progetosTemplate.ListaAP1.Exercicio1;

public class Principal {
    //autor: Guilherme Silveira Figueira
    //função: Faça um algoritmo que i mprima os números múltiplos de 4 em um intervalo de 0 a 100.
    //data: 21/05/22
    //input: ;
    //output: múltiplo de 4 entre 0 à 100;

    public static void main(String[] args) {

        //Maneira 1
        for (int i =0; i <= 100;++i){

            if (i %4 == 0){
                System.out.println(i);
            }

        }

        //Maneira 2
        for (int i =0; i <= 100;i= i+4){

            System.out.println(i);

        }

    }


}
