package abstracao;

public class TV {
    // Atributos encapsulados:
    private boolean ligada;
    private int volume;
    private int canal;

    // Métodos:
    public void ligarDesligar() {
        this.ligada = !this.ligada;
        System.out.println(
          "A TV está " + (ligada ? "ligada" : "desligada")
        );
    }


}
