public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa();
        Casa casa2 = new Casa();

        casa1.inteligente = false;
        casa2.inteligente = true;

        casa1.ligarLuzes();
        casa2.ligarLuzes();
    }
}
