package heranca;
// Classe HomemAranha sendo estendida da Super Classe:
public class HomemAranha extends SuperHeroi {
    // Construtor com os mesmos parâmetros que o da S. Class + chamada ao construtor canônico:
    public HomemAranha(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    public void usarSuperPoder(int index) {
        System.out.println("Usando super poder " + superPoderes[index]);
    }
}
