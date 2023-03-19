package aulas_1_temporada;

public class Aula_24 {

    //Aula de LAÇOS/CICLOS/LOOPS --> FOR
    //Util para uma condição pronta(Valores pré-determinados)*

    public static void main(String[] args) {

        //LAÇO 1 - MODO PADRÃO
        //for(3 elementos)--> valor inicial( e variável), condição e incremento(Transformar a condição em F, ou seja, encerrar o loop)
        for (int i = 0; i <= 10; ++i) {

            System.out.print(+i);
            System.out.println(" / ");

        }


        //LAÇO 2
        for (int i = 11; i <= 20; ) {

            System.out.print(i);
            ++i;
            System.out.println(" / ");

        }

        //LAÇO 3
        int j = 21;
        for (; j <= 30; j++) {

            System.out.print(j);
            System.out.println(" / ");

        }

        //CICLO SEM CONDIÇÃO OU SEM INCREMENTO = LOOP INFINITO;

    }


}
