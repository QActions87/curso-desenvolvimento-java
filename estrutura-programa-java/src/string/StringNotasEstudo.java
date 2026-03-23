package string;

import java.util.Scanner;

/* String é um tipo de referência que representa
 *  uma cadeia de caracteres.
 */
public class StringNotasEstudo {
    public static void main(String[] args) {
        String texto = "Olá, mundo! Me livrei da maldição";
        System.out.println(texto);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Seu nome é: " + nome);

        scanner.close();
    }
}
