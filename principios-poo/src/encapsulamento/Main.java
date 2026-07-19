package encapsulamento;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligarCarro();
        carro.acelerar();
        carro.frear();

        // Acessando o atributo:
        System.out.println(carro.getVolante());

        // Acessando o atributo para modificar:
        carro.setVolante("exemplo");

        // Acessando o atributo modificado:
        System.out.println(carro.getVolante());
    }
}