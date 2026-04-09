package repeticao;

public class JumpStatements {
    public static void main(String[] args) {
        // Exemplo de uso do Jump Statement "continue" para imprimir apenas os números pares de 1 a 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue; // Pula para a próxima iteração se o número for ímpar
            }
            System.out.println(i); // Imprime apenas os números pares
        }
    }
}
