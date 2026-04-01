/* Saudação no console.
 *
 * Programa que lê um nome e imprime uma saudação, utilizando o
 * Console ao invés do Scanner.
 * 
 * Javadoc: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/Console.html
 * 
 */

package console;

import java.io.Console;

public class SaudacaoConsole {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Digite seu nome: ");
        String nome = console.readLine();
        System.out.printf("Olá! Seja bem-vindo!%n", nome);
    }
}
