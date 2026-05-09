public class ArrayMultidimensional {
    public static void main(String[] args) {
        int multidimencional [] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Imprimindo os valores iniciais:
        System.out.println(multidimencional[0][0]); // Imprime 1
        System.out.println(multidimencional[1][0]); // Imprime 4
        System.out.println(multidimencional[2][0]); // Imprime 7
        // Modificando os valores:
        multidimencional[0][0] = 10; // Modifica o valor na posição [0][0] para 10
        multidimencional[1][0] = 40; // Modifica o valor na posição [1][0] para 40 
        multidimencional[2][0] = 70; // Modifica o valor na posição [2][0] para 70  
        // Imprimindo os valores modificados:
        System.out.println(multidimencional[0][0]); // imprime 10
        System.out.println(multidimencional[1][0]); // Imprime 40
        System.out.println(multidimencional[2][0]); // Imprime 70
    }
}
