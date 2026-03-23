package io;

import java.util.Scanner;
/*
 * Entrada e Saída de dados (I/O)
 * Entrada de Dados: Captura de dados digitados pelo User.
 * Saída de dados: Exibição de dados processados.
 */
public class IoNotasEstudos {
    public static void main(String[] args) {
        System.out.println("Digite um valor inteiro:");
        // Leitura de dados de entrada
        Scanner scanner = new Scanner(System.in);
        int valorDigitado = scanner.nextInt();
        System.out.println(valorDigitado);
        scanner.close();

        // Saída de dados
        float outroValor = 10.5f;
        System.out.printf("O número digitado foi: %d%n", valorDigitado);
        System.out.printf("O número float foi: %f%n", outroValor);
    }
}
