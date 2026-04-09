/*
 * Exemplo de uso do Jump Statement "break" para encerrar um loop 
 * quando o usuário digitar um número específico (0 neste caso).
 * 
 */

package repeticao;

import java.util.Scanner;

public class JumpStatementsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número inteiro (0 para sair): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break; // Encerra o loop se o número for 0.
            }
        }    
        System.out.println("Programa encerrado. Obrigado por usar!");
        scanner.close();
    }
}
