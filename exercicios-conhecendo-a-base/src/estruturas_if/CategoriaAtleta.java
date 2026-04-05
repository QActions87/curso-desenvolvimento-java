/* 
 * Lê a idade de um atleta e imprime sua categoria.
 *
 * Mirim: 10 a 12 anos
 * Infantil: 13 a 15 anos
 * Juvenil: 16 a 18 anos
 */

package estruturas_if;

import java.util.Scanner;

public class CategoriaAtleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade do atleta: ");
        int idade = scanner.nextInt();

        if (idade >= 10 && idade <= 12) {
            System.out.println("Categoria: Mirim");
        } else if (idade >= 13 && idade <= 15) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 16 && idade <= 18) {
            System.out.println("Categoria: Juvenil");
        } else {
            System.out.println("Idade fora das categorias disponíveis.");
        }


        scanner.close();
    }
    
}
