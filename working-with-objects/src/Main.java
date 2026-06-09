public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(false);
        Casa casa2 = new Casa(true);
        Casa casa3 = new Casa();

        casa3.inteligente = false;

        casa1.ligarLuzes();
        casa2.ligarLuzes();
        casa3.ligarLuzes();
    }
}

























