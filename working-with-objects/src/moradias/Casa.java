package moradias;

// Classe moradias.Casa:
public class Casa {
    public Boolean inteligente = false; // Atributo Objeto: nasce como 'null' por padrão
    public String nome;

    // Construtor Padrão, sem parâmetros:
    public Casa() {

    }
    // Construtor com parâmetros:
    public Casa(boolean inteligente) {
        // Atributo objeto recebendo o argumento primitivo booleano:
        this.inteligente = inteligente;
    }
    // Metodo para ligar as luzes:
    public void ligarLuzes() {
      if (inteligente) {
        System.out.println("comando de Voz: ligar luzes");
      } else {
        System.out.println("luzes ligadas manualmente");
      }  
    }
}