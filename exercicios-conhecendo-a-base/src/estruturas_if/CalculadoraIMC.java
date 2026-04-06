/*
 * Calcula o IMC (Índice de Massa Corporal) e classifica:
 * 
 * Menor que 18,5 ----> MAGREZA
 * Entre 18,5 e 24,9 -> NORMAL
 * Entre 25 e 29,9 ---> SOBREPESO
 * Entre 30 e 39,9 ---> OBESIDADE
 * Maior >= 40 -------> OBESIDADE GRAVE
 * 
 * Fórmula => IMC = peso / (altura * altura)
 */
package estruturas_if;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário:
        Scanner scanner = new Scanner(System.in);

        // captura o peso informado pelo usuário:
        System.out.println("------------------------------");
        System.out.println("Digite o peso (kg): ");
        double peso = scanner.nextDouble();
        
        // Captura a altura informada pelo usuário:
        System.out.println("------------------------------");
        System.out.println("Digite a altura (m): ");
        double altura = scanner.nextDouble();

        // Calcula o IMC:
        double imc = peso / (altura * altura);

        // Exibe o IMC calculado:
        System.out.println("------------------------------");
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        // Classificação do IMC:
        if (imc < 18.5) {
            System.out.println("------------------------------");
            System.out.println("Classificação: MAGREZA");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("------------------------------");
            System.out.println("Classificação: NORMAL");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("------------------------------");
            System.out.println("Classificação: SOBREPESO");
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.println("------------------------------");
            System.out.println("Classificação: OBESIDADE");
        } else {
            System.out.println("------------------------------");
            System.out.println("Classificação: OBESIDADE GRAVE");
        }

        scanner.close();
    }
}
