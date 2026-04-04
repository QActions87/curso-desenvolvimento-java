/* 
 * 1º passo: Lê um número;
 * 2º passo: Verifica se é par ou ímpar;
 * 3º passo: Informa o resultado.
 */
package estruturas_if;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        
        } else { 
            System.out.println("O número é ímpar.");
        }
        scanner.close();
    }
}
