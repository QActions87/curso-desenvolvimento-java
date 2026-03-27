/*
 * Programa que informa às relações de ordem existentes entre dois números, usando operadores lógicos:     
 * 
 * Ex.: == (igual), != (não igual), > (maior que), < (menor que), >= (maior ou igual), <= (menor ou igual).
 * 
 * Passos:
 *  - 1. Ler 2 números.
 *  - 2. Imprimir relacionamentos de ordem.
 * 
 * Ex.: Dados os números 2 e 3:
 * 2 = 3 ?; 2 != 3 ?; 2 > 3 ?; 2 < 3 ?; 2 >= 3 ?; 2 <= 3 ?; 
 */
package oprelacional;

import java.util.Scanner;

public class RelacionamentosDeOrdem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // INstanciando a classe Scanner (Captura input).
        
        System.out.println("Digite 2 números:");
        int numero1 = scanner.nextInt(); // Variáveis para pacturar o input numérico do usuário.
        int numero2 = scanner.nextInt();

        // Comparações:
        System.out.println(numero1 + " == " + numero2 + " ? " + (numero1 == numero2));
        System.out.println(numero1 + " != " + numero2 + " ? " + (numero1 != numero2));
        System.out.println(numero1 + " > " + numero2 + " ? " + (numero1 > numero2));
        System.out.println(numero1 + " < " + numero2 + " ? " + (numero1 < numero2));
        System.out.println(numero1 + " >= " + numero2 + " ? " + (numero1 >= numero2));
        System.out.println(numero1 + " <= " + numero2 + " ? " + (numero1 <= numero2));
        
        scanner.close(); // Fechamento do recurso scanner.
    }
}
