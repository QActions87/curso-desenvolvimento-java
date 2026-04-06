/*
 * Programa que checa se um ano é bissexto.
 * Um ano bissexto é divisível por 4, com exceção dos...
 * anos divisíveis por 100, mas não divizíveis por 400.
 * 
 * Ex.: O ano 2000 foi bissexto porque é divisível por 400.
 * Mas, o ano 1900 não foi bissexto porque é divisível por 100, 
 * mas não por 400.
 */

package estruturas_if;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int ano = scanner.nextInt();
        // Verifica o NÃO bissexto:
        if (ano % 4 != 0 || (ano % 100 == 0 && ano % 400 != 0)) {
            System.out.println("O ano " + ano + " NÃO é bissexto.");
        } else {
            System.out.println("O ano " + ano + " É bissexto.");
        }
        scanner.close();
    }
}
