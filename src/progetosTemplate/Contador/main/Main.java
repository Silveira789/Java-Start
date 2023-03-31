package progetosTemplate.Contador.main;

import progetosTemplate.Contador.model.Contador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Contador de numeros");
        System.out.println("Insira os numeros inicial e final, respectivamente: ");
        System.out.print(Contador.contador(scan.nextInt(), scan.nextInt()));



    }

}
