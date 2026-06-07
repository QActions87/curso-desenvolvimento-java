import java.util.Scanner;

public class ObjectOrientedProgram {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.calcular();
    }
}

class Calculadora {
    double operando1;
    double operando2;

    public void calcular() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o 1º operando: ");
        this.operando1 = scanner.nextDouble();

        System.out.println("Informe o 2º operando: ");
        this.operando2 = scanner.nextDouble();

        double resultado = somar();
        System.out.printf("%.2f + %.2f = %.2f", operando1, operador2, resultado);
        scanner.close();
    }

}