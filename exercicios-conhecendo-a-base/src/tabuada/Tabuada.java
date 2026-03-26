/*
 * Imprimir a tabuada de um número.
 *
 * 1. Ler um número.
 * 2. Imprimir a tabuada desse número.
 * 
 * Ex.: 1 x 1 = 1; 1 x 2 = 2; ...
 */
package tabuada; // referência do pacote.

import java.util.Scanner; // Import do recurso 'Scanner'.

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instanciando o Scanner.

        System.out.println("Digite o número do qual deseja a tabuada: ");
        int numero = scanner.nextInt(); // Captura do input do usuário, armazenado na variável 'numero'.

        System.out.println(numero + " x 1 = " + (numero * 1)); // Montagem da tabuada, de acordo com o nº
        System.out.println(numero + " x 2 = " + (numero * 2)); // informado pelo usuário.
        System.out.println(numero + " x 3 = " + (numero * 3));
        System.out.println(numero + " x 4 = " + (numero * 4));
        System.out.println(numero + " x 5 = " + (numero * 5));
        System.out.println(numero + " x 6 = " + (numero * 6));
        System.out.println(numero + " x 7 = " + (numero * 7));
        System.out.println(numero + " x 8 = " + (numero * 8));
        System.out.println(numero + " x 9 = " + (numero * 9));
        System.out.println(numero + " x 10 = " + (numero * 10));

        scanner.close(); // Fechamento do recurso scanner, para não haver vazamento.
    }
}
