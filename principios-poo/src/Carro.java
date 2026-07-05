public class Carro {

    public String volante;
    public String pedais;

    private Motor motor;
    private String airbag;

    public void ligarCarro() {
        System.out.println("Ligando o carro...");
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando....");
    }

    public void ativarAirbags() {
        System.out.println("Ativando airbags...");
    }
}
