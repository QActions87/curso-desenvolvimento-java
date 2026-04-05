/*  
 * Lê 3 números e os imprime em ordem crescente.
 */
package estruturas_if;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o 3º número: ");
        int num3 = scanner.nextInt();

        // Verif. se o 1º num é o menor:
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1);
            // Verif. se o 2º num é menor que o 3º, ou o vice-versa:
            if (num2 < num3) {
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num2);
            }
            // Verif. se o 2º num é o menor:
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2);
            // Verif. se o 1º num é menor que o 3º, ou o vice-versa:
            if (num1 < num3) {
                System.out.println(num1);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num1);
            }
            // Verif. se o 3º num é o menor:
        } else {
            System.out.println(num3);
            // Verif. se o 1º num é menor que o 2º, ou o vice-versa:
            if (num1 < num2) {
                System.out.println(num1);
                System.out.println(num2);
            } else {
                System.out.println(num2);
                System.out.println(num1);
            }
        }
            scanner.close();
    
    }
}
