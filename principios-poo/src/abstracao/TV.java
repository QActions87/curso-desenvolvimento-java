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

    public void aumentarVolume() {
        this.volume++;
        System.out.println("Volume atual: " + this.volume);
    }

    public void reduzirVolume() {
        this.volume--;
        System.out.println("Volume atual: " + this.volume);
    }

    public  void  trocarCanal(int novoCanal) {
        this.canal = novoCanal;
        System.out.println("Canal atual: " + this.canal);
    }
}
