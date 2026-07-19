package heranca;

import java.util.Arrays;

// Classe HomemAranha sendo estendida da Super Classe:
public class HomemAranha extends SuperHeroi {
    // Construtor com os mesmos parâmetros que o da S. Class + chamada ao construtor canônico:
    public HomemAranha(String traje, String[] superPoderes) {

        super(traje, superPoderes);
    }
    // Metodo sobrescrito:
    public void usarSuperPoder(int index) {
        super.usarSuperPoder(index);
        System.out.println(Arrays.toString(superPoderes));
        System.out.println("Usando teia para se locomover entre prédios!");
    }
}
