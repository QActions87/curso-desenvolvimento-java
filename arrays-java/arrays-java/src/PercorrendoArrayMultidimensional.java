public class PercorrendoArrayMultidimensional {
    public static void main(String[] args) {
        int multidimencional [] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // Iterando sobre o array multidimensional usando loops Foreach aninhados:
        for(int[] i : multidimencional) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(); // Imprime uma nova linha após cada linha do array
        }

    }
}
