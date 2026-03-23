package casting;

public class CastingNotasEstudos {    
    public static void main(String[] args) {
        // Widenig Casting (implícito) => Quando guarda tipo menor em maior.
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena; // Casting implícito

        System.out.println(variavelGrande);

        // Narrowing Casting (explícito) => Quando guarda tipo maior em menor.
        long variavelLong  = 65467;
        int variavelInt2 = (int) variavelLong; // Casting explícito

        System.out.println(variavelInt2);

        // Narrowing Casting (explícito) => Divisão entre inteiros com resultado float.
        int num1 = 9;
        int num2 = 2;
        float resultado = num1 / (float) num2; // Casting explícito

        System.out.println(resultado);

    }
}