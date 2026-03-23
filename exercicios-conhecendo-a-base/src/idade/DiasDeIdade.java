package idade;

import java.util.Scanner;
/**
 * Exercício 2:
 * 
 * 1. Ler a idade em anos.
 * 2. Calcular a idade em dias.
 * 3. Imprimir resultado.
 */
public class DiasDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade em anos: ");
        int anosDeIdade = scanner.nextInt();
        int diasDeIdade = anosDeIdade * 365;
        System.out.printf("Você tem um total de %d dias de idade.", diasDeIdade);
        scanner.close();
    }
}
