package aulas_1_temporada;

//Como importar pacotes:

//Especificos:
// Pacote Scanner = Conj. de ferramentas  utilizadas para a interação do usuario com o programa

import java.util.Scanner;

//Gerais:
//Importando todas as classes contidas do deternaminado pacote (utlizar *)

// importando todas as classes do pacote "util" ( que inclui Scanner)

public class Aula_10_e_11 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int base, altura, areaT;

        System.out.println("Calculo Area do rêtangulo. Insire o valor em metros da base: ");
        base = ler.nextInt();
        // o ".nextInt()" tem a função de armazenar um valor inteiro em uma variável.
        System.out.println("Insira a altura");
        altura = ler.nextInt();

        areaT = base * altura;
        System.out.println(areaT);

    }

}
