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
        
        // Verificar tamanho do array:
        System.out.println("Tamanho do array: " + frutas.length); // Imprime "Tamanho do array: 4"

        // Iterar sobre o array usando um loop for:
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i] + " está na posição " + i);
        }
        // Iterar sobre o array usando um loop for-each:
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
