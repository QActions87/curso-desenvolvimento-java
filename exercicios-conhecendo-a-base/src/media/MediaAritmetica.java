package media;

import java.util.Scanner;
/**
 * Exercício 1:
 * 
 * 1. Ler 3 notas.
 * 2. Calcular média.
 * 3. Imprimir resultado.
 * 
 * Fórmula: MA = (n1 + n2 + n3) / 3
 */
public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Capturando as notas digitadas:
        System.out.println("Digite as 3 notas do(a) aluno(a): ");
        double nota01 = scanner.nextDouble();
        double nota02 = scanner.nextDouble();
        double nota03 = scanner.nextDouble();
        // Encerrando o recurso [scanner]:
        scanner.close();
        // Calculando a média aritmética:
        double mediaAritmetica = (nota01 + nota02 + nota03) / 3;
        System.out.printf("Média Aritmética é: %.2f", mediaAritmetica); // Print da média. Decimal 2 casas
    }
}