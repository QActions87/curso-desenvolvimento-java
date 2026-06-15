public class Matematica {
    public static final Double LIMITE_OPERACIONAL = 100.0;

    public static Double soma (double n1, double n2) {
        double soma = n1 + n2;
        if (soma > LIMITE_OPERACIONAL) {
            return LIMITE_OPERACIONAL;
        } else {
            return soma;
        }
    }

    public Double somaNaoEstatica(double n1, double n2) {
        double soma = n1 + n2;

        if (soma > LIMITE_OPERACIONAL) {
            return LIMITE_OPERACIONAL;
        } else {
            return soma;
        }
    }
}
