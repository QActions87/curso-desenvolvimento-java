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

    // Metodos:
    public void usarSuperPoder(int index) {
        System.out.println("Usando super poder " + superPoderes[index]);
    }

    // Metodo Get para acessar o traje:
    public String getTraje() {
        return traje;
    }
}
