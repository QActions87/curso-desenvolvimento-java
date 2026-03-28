/* 
 * Imprime preço de um produto com base no desconto à vista
 * e o valor economizado.
 *
 * 1. Ler preço. 
 * 2. Ler % de desconto.
 * 3. Imprimir novo preço e valor economizado em reais.
 * 
 * Ex.: R$: 100,00 com 10% de deconto = O preço com desconto é R$: 90,00
 * e o valor economizado foi R$: 10,00.
 **/
package desconto;

import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); // Dá acesso ao teclado
        // Leitura dos valores de entrada, armazenando às variáveis do tipo double:
        System.out.println("Digite o preço: ");
        double preco = scanner.nextDouble();
        System.out.println("Digite a % de desconto: ");
        double desconto = scanner.nextDouble();
        // Manipulação das variáveis para o cálculo:
        double valorEconomizado = preco * (desconto / 100);
        double novoPreco = preco - valorEconomizado;
        //possibilidade 1: Output com o 'println':
        System.out.println("O preço com desconto é R$: " + String.format("%.2f", novoPreco));
        System.out.println("O valor economizado foi R$: " + String.format("%.2f", valorEconomizado));
        //possibilidade 2: Output com o 'printf':
        System.out.printf("O preço com desconto é R$: %.2f\n", novoPreco);
        System.out.printf("O valor economizado foi R$: %.2f\n", valorEconomizado);

        scanner.close();
    }
}
