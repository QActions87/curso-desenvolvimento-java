public class ArrayMultidimensional {
    public static void main(String[] args) {
        int multidimencional [] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Imprimindo os valores iniciais:
        System.out.println(multidimencional[0][0]);
        System.out.println(multidimencional[1][0]);
        System.out.println(multidimencional[2][0]);
        // Modificando os valores:
        multidimencional[0][0] = 10;
        multidimencional[1][0] = 40;
        multidimencional[2][0] = 70;
        // Imprimindo os valores modificados:
        System.out.println(multidimencional[0][0]);
        System.out.println(multidimencional[1][0]);
        System.out.println(multidimencional[2][0]);
    }
}
