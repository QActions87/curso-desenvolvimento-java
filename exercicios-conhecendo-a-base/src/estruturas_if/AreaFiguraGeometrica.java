/*
 * Calcula à área de figuras geométricas (retangulo, triangulo, circulo)
 *
 * Fórmulas:
 *  - retangulo: base * altura.
 *  - triangulo: (base * altura) / 2.
 *  - circulo: pi * raio².
 */

package estruturas_if;

import java.util.Scanner;

public class AreaFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a figura geométrica  que será calculada à área(retangulo, triangulo, circulo): ");
        String figura = scanner.next();

        switch (figura) {
             // Caso seja retângulo:
            case "retangulo" -> {
                System.out.println("Informe a base do retângulo: ");
                int base = scanner.nextInt();
                System.out.println("Informe a altura do retângulo: ");
                int altura = scanner.nextInt();

                // Cálculo retângulo:
                int area = base * altura;
                System.out.println("Área do retângulo: " + area);

            } // Caso seja triângulo:  
            case "triangulo" -> {
                System.out.println("Informe a base do triângulo: ");
                int base = scanner.nextInt();

                System.out.println("Informe a altura do triângulo: ");
                int altura = scanner.nextInt();

                // Cálculo triângulo:
                double area = (base * altura) / 2.0;
                System.out.println("Área do triângulo: " + area);

            } // Caso seja círculo:
            case "circulo" -> {
                System.out.println("Informe o raio do círculo: ");
                int raio = scanner.nextInt();
                double area = 3.14 * (raio * raio);
                System.out.println("Área do círculo: " + area);
            } // Caso a opção não seja nenhuma das anteriores:
            default -> System.out.println("Figura geométrica inválida.");
        }
        scanner.close();
    }
}
