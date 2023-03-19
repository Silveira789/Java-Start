package aulas_1_temporada;

public class Aula_15 {
    //conteudo: Calculo e ajuste de horario - "UNIX TIME"

    public static void main(String[] args) {

        long totalMilisegundos = System.currentTimeMillis(); //-10.800.000 = Horario Braisl

        // esta função armazena o total de milisegundos desde 1970 ate agh do hemisfério central(fuso horario = 0)
        // Brasil = -3 , -4 e -5

        long totalSegundos = totalMilisegundos / 1000;  // 1 s = 1000 ms
        long SegundoAtual = totalSegundos % 60;

        long totalMinutos = totalSegundos / 60;         // 1 min = 60 s
        long MinutoAtual = totalMinutos % 60;           //

        long totalHoras = totalMinutos / 60;            // 1 hora = 60 min
        long HorasAtual = totalHoras % 24;              // 1 dia = 24 hrs

        System.out.println("Hemisferio Central: " + HorasAtual +":"+ MinutoAtual + ":"+ SegundoAtual);

        // Calculo de fuso horário (Brasil = -3): 3 * 60(hora) * 60(min) * 60(seg) * 1000(ms) = 10.800.000



    }


}
