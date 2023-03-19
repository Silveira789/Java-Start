package aulas_1_temporada;

import java.util.Scanner;

public class Aula_21 {

    //Verificar se ano é bissexto
    /*
    Condições para um ano bissexto:
    --> Multiplos de 400;
    --> Multiplos de 4 e não de 100;
    --> Os demais não são bissextos;

    *Notas multiplo: resultado da multiplicação de um numero com outro, o qual a divisão entre eles o resto é 0;

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ano;
        int repet = 0;


        System.out.print("Digite um determinado ano para saber se ele é bissexto: ");
        ano = input.nextInt();


        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {

            System.out.println("O ano inserido é bissexto ");

        } else {
            System.out.println("O ano inserido não é bissexto");
        }

        //2° maneira de realizar

        boolean condicao = ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0));
        System.out.println(condicao);
        //com o boolean verifico se retorna o valor V ou F.


        //Experimento loop --> OK

        do {
            System.out.println("Tinha o PET e o rePET, mas o pet morreu. Então quem sobrou??  1 = rePET e 0 = PET ");
            repet = input.nextInt();

        } while (repet != 0);

    }


}
