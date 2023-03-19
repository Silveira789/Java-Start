package aulas_2_temporada;

import java.util.Scanner;

public class Aula_30_31_32 {

    // Arrays ou Vetores
    //Função = armazenar vários valores na mesma variável;
    //Usar laço FOR para prencher valores de um Vetor;
    //Atribuir valores nos slots de vetores;

    public static void main(String[] args) {


        double[] notasAlunos = new double[5];
        /*
        Estrutura Array:
        double -->tipo de dado
        []--> chave de identificação Vetor
        notasAlunos --> Variável
        new double-->
        [50]--> tamanho do vetor
         */

        notasAlunos[0] = 5.5;
        notasAlunos[1] = 3.3;
        notasAlunos[2] = 7.6;
        notasAlunos[3] = 9;
        notasAlunos[4] = 8.6;

        System.out.println(notasAlunos[2]);
        System.out.println(notasAlunos);
        System.out.println("----------------");


        //2° Forma p/ tamanho do vetor
        int num = 7;
        double[] diasSemana = new double[num];

        //
        Scanner input = new Scanner(System.in);
        int numEstudantes = 5;
        double[] notaEstudantes = new double[numEstudantes];

        for (int i=0; i < numEstudantes; ++i) {

            System.out.println("Insira a nota do "+ (i+1) + " ° aluno:"); // o + 1 é necessário, pois o contador começa com 0;
            notaEstudantes[i] = input.nextInt();


        }

        for (int i=0; i < numEstudantes; ++i) {

            System.out.print("Nota do "+ (i+1) + " ° aluno: ");
            System.out.println(notaEstudantes[i]);




        }

        int i;
        int[] x = new int[10]; // IMPORTANTE --> o JAVA automaticamente inicia c/ o valor 0 para o vetor;
        //Vetor x tem 5 slots

        /*

        x[0] = 12;
        x[1] = 43;

        */

        // o valor de "new int[]" tem que ser no mínimo o valor do "i"

        // "length" = comprimento --> ao utilizar essa função
        // antes = for (i=0; i < 5; ++i){}

        for (i=0; i < x.length; ++i){
            x[i] = 50; //preenchendo os valores do vetor c/ 50;
        }

        //Java já tem recurso do "laço" for anteior, p/ usar esse método:  "java.util.Arrays.fill();" --> "fill" significa preencher

        java.util.Arrays.fill(x,50);
      //(nome do vetor, endereço inicial, endereço final, valor de preenchimento)
        java.util.Arrays.fill(x,3,6,88); // o n° 88 vai preencher os slots 3,4 e 5. (Vai de 3 à 6, não inclui o endereço final)

        for (i=0; i < x.length; ++i){

            System.out.println(x[i]); // imprimindo o slot n° i do meu vetor x;

        }



        int[] y = {55,38,13,48,7};
        //Vetor de tamanho especializado: 5 slots, de 0 à 4 e com cada valor já preenchido;


        //Ajustar antes de executar o código

    }

}
