package estrutura_switch;

import java.io.Console;

public class ChecadorDeNotas {
    public static void main(String[] args) {
        // Asnotas podem ser: A, B,C, D, E ou F
        Console console = System.console();

        System.out.println("Informe a nota (A, B,C, D ou F)");
        String nota = console.readLine();
        // 1ª Forma de usar o novo switch:
        //switch(nota) {
        //  case "A" -> System.out.println("Excelente!");
        //  case "B" -> System.out.println("Bom trabalho!");
        //  case "C" -> System.out.println("Está progredindo!");
        //  case "D" -> System.out.println("Precisa melhorar!");
        //  case "F" -> System.out.println("Você precisa estudar mais!");
        //  default -> System.out.println("Nota inválida!");
        //}

        // 2ª Forma de usar o novo switch:
        String mensagem = switch (nota) {
            case "A" -> "Excelente!";
            case "B" -> "Bom trabalho!";
            case "C" -> "Está progredindo!";
            case "D" -> "Precisa melhorar!";
            case "F" -> "Você precisa estudar mais!";
            default -> "Nota inválida!";
        };
        System.out.println(mensagem);

    }
}
