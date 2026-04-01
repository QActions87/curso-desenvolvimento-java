package estruturas_if;

import java.util.Scanner;

public class ChecadorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt(); 
        // If comum:
        // if (idade >= 18) {
        //     System.out.println("Pode comprar o ingresso!");
        // } else {
        //     System.out.println("Este evento é para maiores de 18 anos!");
        // }

        // If ternário: [ condição ? expressão1: expressão2 ] // {? => If} [: => else]
        String mensagem = 
        (idade >= 18) ? "Pode comprar o ingresso!" : "Este evento é para maiores de 18 anos!";
        System.out.println(mensagem);

        scanner.close();
    }
}
