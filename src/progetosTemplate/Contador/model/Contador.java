package progetosTemplate.Contador.model;

public class Contador {

    public static String contador(int a, int b) {
        String cont = "";
        for (int c = a; c <= b; c++) {
            cont += c + " ";

        }

        return cont;

    }

}
