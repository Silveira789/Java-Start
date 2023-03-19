package aulas_2_temporada;

public class Aula_28 {

    //Operador Condicional
    /*
    Estrutura de uma condição:

    condição ? caso verdadeiro : caso falso;

    A condição retorna um valor,  se verdadeiro : se falso

     */


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int maior;

        //Represetação 1
        maior = (a < b) ? 1 : 0;
        System.out.println(maior);

        //Representação 2

        maior = false ? 2 : 3;

        System.out.println(maior);



    }
}
