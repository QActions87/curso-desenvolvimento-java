import java.util.Scanner;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate();
    }
}
// Class Calculator
class Calculator {
    double operand1;
    double operand2;

    // Method 'somar()':
    public double add() {
        return this.operand1 + this.operand2;
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o 1º operando: ");
        this.operand1 = scanner.nextDouble();

        System.out.println("Informe o 2º operando: ");
        this.operand2 = scanner.nextDouble();

        double resultant = add();
        System.out.printf("%.2f + %.2f = %.2f", operand1, operand2, resultant);
        scanner.close();
    }

}