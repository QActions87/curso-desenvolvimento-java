/*
 * Exemplo de uso do Jump Statement "return" para encerrar um método 
 * quando o usuário digitar um número específico (0 neste caso).
 */

package repeticao;

import java.util.Scanner;

public class JumpStatementsIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Loop infinito que só será encerrado quando o usuário digitar 0.
        while (true) {
            System.out.print("Digite um número inteiro (0 para sair): ");
            int numero = scanner.nextInt();
            // Verifica se o número digitado é 0, para encerrar o programa.
            if (numero == 0) {
                System.out.println("Programa encerrado. Obrigado por usar!");
                scanner.close();
                return; // Encerra o método main.
            }
        }    
    }
}