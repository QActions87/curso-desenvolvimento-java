//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligarCarro();
        carro.acelerar();
        carro.frear();

        // Acessando os atributos:
        System.out.println(carro.motor);
        System.out.println(carro.volante);
        System.out.println(carro.airbag);
        System.out.println(carro.pedais);
    }
}