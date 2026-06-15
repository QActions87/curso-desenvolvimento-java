
public class Main2 {
    public static void main(String[] args) {

        Double soma = Matematica.soma(5.0, 4.0);
        Double somaNaoEstatica = new Matematica().somaNaoEstatica(6.0, 7.0);
        System.out.println(somaNaoEstatica);
        System.out.println(soma);
        System.out.println(Matematica.LIMITE_OPERACIONAL);
    }
}
