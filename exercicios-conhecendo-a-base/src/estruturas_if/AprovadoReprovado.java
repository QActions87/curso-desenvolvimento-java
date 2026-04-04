/* 
 * 1º passo: Lê 3 notas;
 * 2º passo: Calcula a média aritmética;
 * 1º passo: Informa se aprovado ou reprovado.
 */
package estruturas_if;

import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leitura das notas:
        System.out.println("Digite a nota do aluno: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        // Cálculo da média:
        double media = (nota1 + nota2 + nota3) / 3;
        // Verificação da aprovação:
        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        // Fechamento do recurso scanner:
        scanner.close();

    }
}
