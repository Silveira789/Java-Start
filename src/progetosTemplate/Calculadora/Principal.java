package progetosTemplate.Calculadora;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1,num2,res;
        int op;

        System.out.println("Insira 2 numeros");

        System.out.print("1° numero: ");
        num1 = input.nextDouble();

        System.out.print("2° numero: ");
        num2 = input.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1--> soma");
        System.out.println("2--> subtração");
        op = input.nextInt();

        if (op == 1){

            res = num1 + num2;
            System.out.println(res);

        }else if (op == 2){

            res = num1 -  num2;
            System.out.println("resultado: " + res);
        }else{
            System.out.println("Operação errada!!");
        }




    }

}
