public class Carro {
    // Atributos privados:
    private String volante;
    private String pedais;
    private Motor motor;
    private String airbag;

    // Métodos:
    public void ligarCarro() {
        System.out.println("Ligando o carro...");
    }

    public void acelerar() {
        motor.iniciar();
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando....");
    }

    private void detectarColisao() {
        ativarAirbags();
    }

    private void ativarAirbags() {
        System.out.println("Ativando airbags...");
    }

    // Métodos Getters e Setters:
    public String getPedais() {
        return pedais;
    }

    public void setPedais(String pedais) {
        this.pedais = pedais;
    }
}
