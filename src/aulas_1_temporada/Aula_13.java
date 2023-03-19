package aulas_1_temporada;
import java.util.Scanner;

public class Aula_13 {

    //conteudo: variáveis constantes = "final"

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        final double PI = 3.14;  // por convenção variaveis constatantes tem nomenclatura maiuscula

        System.out.println("Digite o valor do raio: ");
        double raio = leia.nextDouble();

        double area = raio * raio * PI;
        System.out.println("Area do circulo = " + area);

    }


}
