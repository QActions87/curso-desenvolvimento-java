package heranca;

public class Main {
    public static void main(String[] args) {
        // Array com instanciando os herois com Traje e Poder:
        SuperHeroi[] superHerois = {
            new HomemAranha("Roupa Vermelha com teias.", new String[] {"Lançar Teia."}),
            new HomemDeFerro("Roupa Vermelha super resistente.", new String[] {"Voar."}),
            new Tempestade("Branca.", new String[] {"Controlar o tempo."}),
            new ViuvaNegra("Preta.", new String[] {"Lançar Teia."})
        };

        // For para imprimir cada heroi com seu traje e super poder:
        for (SuperHeroi superHeroi : superHerois) {
            System.out.println(superHeroi.getTraje());
            superHeroi.usarSuperPoder(0);
        }


    }
}
