/*
 * Calcula fatorial com a estrutura de repetição 'for'
 *
 * O fatorial de um número n é o produto de todos os números inteiros positivos menores ou iguais a n.
 * Ex.: O fatorial de 5 (5!) é 5 x 4 x 3 x 2 x 1 = 120.
 */

package repeticao;

public class ForStructure {
    public static void main(String[] args) {
        int n = 5; // Número para calcular o fatorial.
        int factorial = 1; // Variável para armazenar o resultado do fatorial, iniciaando com 1.

        // Loop 'for' para calcular o fatorial de n.
        for (int i = 1; i <= n; i++) {
            System.out.println("Valor de i: " + i + ", Fatorial atual: " + factorial); // Imprime o valor atual de i e o fatorial acumulado antes de multiplicar.
            factorial *= i; // Multiplica o valor atual de factorial por i, acumulando o resultado.
        }
        System.out.println("O fatorial de " + n + " é: " + factorial); // Imprime o resultado final do fatorial.
    }
}
