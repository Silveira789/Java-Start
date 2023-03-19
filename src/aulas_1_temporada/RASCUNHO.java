package aulas_1_temporada;

import java.util.Scanner;

public class RASCUNHO {

    public static void main(String[] args) {

//        Scanner scan  = new Scanner(System.in);
//
//        double num = Math.pow(5,2);
//        System.out.println(num);
//        String name = scan.next();
//
//        name.isEmpty();
//        System.out.println(name);

        String nome = "João";
        imprimeNome("s");
    }

    public static void imprimeNome(String nome) {
        if(!nome.isEmpty()){
            System.out.println( "Tudo bem"  + nome + "?");
        } else {
            System.out.println("O nome é"  + nome + "?");
        }

    }



}
