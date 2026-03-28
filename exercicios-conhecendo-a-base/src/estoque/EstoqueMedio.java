/* 
 * Calcula o estoque médio de um produto, seguindo a fórmula:
 * 
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2.
 *
 * 
 * Ex.: quantidade mínima = 10, quantidade máxima = 20 => estoque médio = 15
 *
 * Passo 1: Ler quantidade mínima.
 * Passo 2: Ler quantidade máxima.
 * Passo 3: Calcular e imprimir o estoque médio.
 **/
package estoque;

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário.
        // Captura do input 'quantidade mínima':
        System.out.println("Informe a quantidade mínima:");
        int quantidadeMinima = scanner.nextInt();
        // Captura do input 'quantidade máxima':
        System.out.println("Informe a quantidade máxima:");
        int quantidadeMaxima = scanner.nextInt();
        // Cálculo do estoque médio:
        int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.printf("O estoque médio: %d unidades.", estoqueMedio);

        scanner.close();
    }
}
