package heranca;

public class SuperHeroi {
    // Atributos:
    private String traje;
    private String[] superPoderes;

    // Construtor canônico (que inicializa todos os atributos da classe):
    public SuperHeroi(String traje, String[] superPoderes) {
        this.traje = traje;
        this.superPoderes = superPoderes;
    }

    public SuperHeroi(String traje) {
        this.traje = traje;

    }

    public SuperHeroi() {

    }

    // Métodos:
    public void usarSuperPoder(int index) {
        System.out.println("Usando super poder " + superPoderes[index]);
    }
}
