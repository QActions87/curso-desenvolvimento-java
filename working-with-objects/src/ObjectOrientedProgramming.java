// Imports the Scanner class from the java.util package to read user input
import java.util.Scanner;

/**
 * Main class that serves as the entry point of the application.
 */
public class ObjectOrientedProgramming {

    // The main method where the execution of the Java program begins
    public static void main(String[] args) {

        // Instantiates a new Calculator object (creates an instance in memory)
        Calculator calculator = new Calculator();

        // Calls the calculate method to trigger the application workflow
        calculator.calculate();
    }
}

/**
 * Calculator class containing the business logic and attributes for mathematical operations.
 */
class Calculator {
    // Instance variables (attributes) to store the numbers for the operation
    double operand1;
    double operand2;

    /**
     * Performs the addition of the two operands stored in the object.
     * @return The sum of operand1 and operand2.
     */
    public double add() {
        // 'this' refers to the current instance variables of this specific object
        return this.operand1 + this.operand2;
    }

    /**
     * Handles the user interface logic, input collection, and output display.
     */
    public void calculate() {
        // Creates a Scanner object to read data from the standard input stream (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Prompts the user and reads the first decimal number
        System.out.println("Informe o 1º operando: ");
        this.operand1 = scanner.nextDouble();

        // Prompts the user and reads the second decimal number
        System.out.println("Informe o 2º operando: ");
        this.operand2 = scanner.nextDouble();

        // Invokes the add() method and stores the returned value into a local variable
        double resultant = add();

        // Prints the formatted output to the console with 2 decimal places
        System.out.printf("%.2f + %.2f = %.2f\n", operand1, operand2, resultant);

        // Closes the scanner to release underlying system resources and avoid memory leaks
        scanner.close();
    }
}