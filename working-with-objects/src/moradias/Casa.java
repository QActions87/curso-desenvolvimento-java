package moradias;

// Classe moradias.Casa:
public class Casa {
    boolean inteligente;
    String nome;

    // Construtor Padrão, sem parâmetros:
    public Casa() {

    }
    // Construtor com parâmetros:
    public Casa(boolean inteligente) {

        this.inteligente = inteligente;
    }

    // Metodo para ligar as luzes:
    void ligarLuzes() {
      if (inteligente) {
        System.out.println("comando de Voz: ligar luzes");
      } else {
        System.out.println("luzes ligadas manualmente");
      }  
    }
}