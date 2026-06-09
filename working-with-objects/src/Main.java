import moradias.Casa;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(false);
        Casa casa2 = new Casa(true);
        Casa casa3 = new Casa();

        casa1.ligarLuzes();
        casa2.ligarLuzes();
        casa3.ligarLuzes();

        casa3.nome = "Zion";
        System.out.println(casa3.nome);
    }
}

























