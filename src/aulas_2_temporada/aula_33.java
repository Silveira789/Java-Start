package aulas_2_temporada;

public class aula_33 {

    //Algoritmo de ordenação: Bubble sort;
    //OBJ: Lógica do Algoritmo;

    public static void main(String[] args) {

        int vetor[] = {9, 5, 6, 4, 7, 8};
        int aux;
        boolean controle;


        // Obj: trocar a posição dos numeros em ordem crescente
        // A quant. max de troca de posição(Obj) é equivalente a quant. de membros que um vetor possui;


        for (int i = 0; i < vetor.length; ++i) {    //Defina a quant. de repetição do processo
            controle = true;
            for (int j = 0; j < (vetor.length - 1); ++j) {  // Armazenamento de 2 valores p/ execução do processo;       // O "-" serve de ajuste para não ultrapassar a quanditade de valores do vetor

                if (vetor[j] > vetor[j + 1]) {          // Comparação de números, e inversão caso necessário; (j e aux)     // Caso n tivesse o "-" [j + 1]  ultrapassaria os 6 valores(Slots)
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;                   //Se ouve necessidade de troca de membros(valores) é necessário repetir essa operação

                }

            }
            if(controle){                              //Caso não precise, esse condigo previne execução desnecessária;
                break;
            }

        }


        for (int i = 0; i < vetor.length; ++i) {

            System.out.print(vetor[i] + " ");

        }

    }


    //Visualização: https://dealunoparaaluno.wordpress.com/2013/06/30/java033-algoritmo-de-ordenacao-bubble-sort/

}
