public class Casa {
    boolean inteligente;

    void ligarLuzes() {
      if (inteligente) {
        System.out.println("comando de Voz: ligar luzes");
      } else {
        System.out.println("luzes ligadas manualmente");
      }  
    }
}