package aulas_2_temporada;

import java.util.Scanner;

public class Aula_27 {

    // SWITCH

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quer aumentar sua sabedoria? \n Selecione um número entre 1 a 8: ");
        int numero = input.nextInt();

        //SWICH --> se trata de um controle, e quando escolhido uma opção é executado uma instrução;
        //case --> significa "caso",


        switch (numero){


            case 1:
                System.out.println("1: O homem comum fala, o sábio escuta, o tolo discute.");
                break;
            case 2:
                System.out.println("2: O saber a gente aprende com os mestres e os livros. A sabedoria se aprende é com a vida e com os humildes.");
                break;
            case 3:
                System.out.println("3: A dúvida é o princípio da sabedoria.");
                break;
            case 4:
                System.out.println("4: A sabedoria da vida não está em fazer aquilo de que se gosta, mas gostar daquilo que se faz.");
                break;
            case 5:
                System.out.println("5: Saber encontrar a alegria na alegria dos outros, é o segredo da felicidade.");
                break;
            case 6:

            case 7:

            case 8:
                System.out.println("6,7 e 8: https://www.youtube.com/watch?v=dQw4w9WgXcQ  ");
                // Casos 6,7 e 8 imprimem a mesma mensagem
                break;
            default:
                System.out.println("Digitou errado né?: A força de vontade dos fracos chama-se teimosia.");
                break;



        }




    }


}
