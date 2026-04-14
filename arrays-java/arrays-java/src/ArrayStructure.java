public class ArrayStructure {
    public static void main(String[] args) {
        // Declarar e Inicializar um array de Strings:
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};
        // Acessar elementos do array:
        System.out.println(frutas[0]); // Imprime "Maçã"
        System.out.println(frutas[1]); // Imprime "Banana"
        System.out.println(frutas[2]); // Imprime "Laranja"
        System.out.println(frutas[3]); // Imprime "Uva"
        
        // Modificar o 2º elemento do array (de:Banana para:Abacaxi):
        frutas[1] = "Abacaxi";
        System.out.println(frutas[1]); // Imprime "Abacaxi"     
    }
}
