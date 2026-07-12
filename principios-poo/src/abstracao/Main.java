package abstracao;

public class Main {
    public static void main(String[] args) {
        TV minhaTV = new TV();
        // Acessando os métodos a partir da instância minhaTV:
        minhaTV.ligarDesligar();
        minhaTV.aumentarVolume();
        minhaTV.reduzirVolume();
        minhaTV.trocarCanal(9);
    }
}
