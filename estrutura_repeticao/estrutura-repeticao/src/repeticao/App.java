package repeticao;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int num = 7, tentativas = 5;
        Scanner sc = new Scanner(System.in);
        // Loop para permitir que o usuário faça tentativas de adivinhar o número.
        while (tentativas > 0) {
            System.out.println("Digite um número entre 1 e 10: ");
            int chute = sc.nextInt();
            // Verifica se o chute é igual ao número sorteado.
            if (chute == num) {
                System.out.println("Parabéns! Você acertou o número!");
                break; // Sai do loop se o usuário acertar o número.
            } else {
                tentativas--; // Decrementa o número de tentativas, se o usuário errar.
            } 
        }
        sc.close();
    }
}
