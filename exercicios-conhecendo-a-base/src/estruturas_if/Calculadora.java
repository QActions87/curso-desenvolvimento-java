package estruturas_if;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Inicializa o scanner para leitura de dados do usuário:
        Scanner scanner = new Scanner(System.in);
        // Lê o 1º num:
        System.out.println("Digite o 1º número: ");
        int num1 = scanner.nextInt();
        // Lê o operador:
        System.out.println("Informe o operador (+, -, *, /): ");
        String operador = scanner.next();
        // Lê o 2º num:
        System.out.println("Digite o 2º número: ");
        int num2 = scanner.nextInt();
        // Realiza o cálculo com base no operador:
        switch (operador) {
            case "+" -> System.out.printf("Resultado:\n%d %s %d = %d\n",
                num1, operador, num2, num1 + num2);
            case "-" -> System.out.printf("Resultado:\n%d %s %d = %d\n",
                num1, operador, num2, num1 - num2);
            case "*" -> System.out.printf("Resultado:\n%d %s %d = %d\n",
                num1, operador, num2, num1 * num2);
            case "/" -> System.out.printf("Resultado:\n%d %s %d = %d\n",
                num1, operador, num2, num1 / num2);  
        }

        scanner.close();
    }
}
