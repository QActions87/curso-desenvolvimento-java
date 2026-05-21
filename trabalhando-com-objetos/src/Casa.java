public class Casa {
    boolean inteligente;

    public Casa(boolean inteligente) {
        this.inteligente = inteligente;
    }

    void ligarLuzes() {
      if (inteligente) {
        System.out.println("comando de Voz: ligar luzes");
      } else {
        System.out.println("luzes ligadas manualmente");
      }  
    }
}