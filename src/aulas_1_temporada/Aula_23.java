package aulas_1_temporada;

public class Aula_23 {

    //Aula de LAÇOS/CICLOS/LOOPS --> WHILE / DO
    // util para situações de repetição de valores indeterminados

    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        //LAÇO 1
        //Neste loop a verificação acontece antes, executando a operação e imprimindo o resultado;
        do {
            y++;
            System.out.println(y);

        } while (y < 10);




        //LAÇO 2
        //Neste ciclo a verificação acontesce Depois, podendo nao imprimir o resultado
        while (x < 10) {
            x++;
            System.out.println(x);
        }

    }


}
