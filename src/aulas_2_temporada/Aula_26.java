package aulas_2_temporada;

import java.util.Scanner;

public class Aula_26 {

    // BREAK e CONTINUE

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número de 0 a 10: ");
        int num = input.nextInt();

        for (int i = 0; i <= 10; ++i) {

            if (i == num) {

                System.out.println("O seu número  é : " + i);
                //--> break;
                //Quebra a execução de um ciclo

            } else {
                System.out.println("O seu número não é: " + i);

                continue;
                //continua a execução do ciclo pulando a proxima instrução (no caso o "opa!!!")
            }

            System.out.println("Opa!!!!");


        }


    }


}
