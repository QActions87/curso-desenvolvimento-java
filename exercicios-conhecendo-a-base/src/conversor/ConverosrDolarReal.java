/* Conversor de Dólar para Real. 
 *
 * Programa que coverte um valor em dólar para real.
 * 
 * Ex.: Dólares = 100, Cotação = 4,92 => O valor em reais é R$: 492,00.
 */
package conversor;

import java.util.Scanner;

public class ConverosrDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê e armazena o valor em dólar
        System.out.println("Digite o valor em dólar:");
        double dolares = scanner.nextDouble();
        
        // Lê e armazena a cotação do dólar
        System.out.println("Digite a cotação do dólar:");
        double cotacao = scanner.nextDouble();
        // Calcula o valor em reais
        double reais = dolares * cotacao;
        
        System.out.printf("O valor em reais é R$: %.2f%n", reais);

        scanner.close();
    }
}
