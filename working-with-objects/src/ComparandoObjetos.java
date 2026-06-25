import java.util.Arrays;

public class ComparandoObjetos {
    public static void main(String[] args) {
        // criando usuário do array 1:
        Usuario  u1 = new Usuario();
        u1.nome = "u1";
        Usuario  u2 = new Usuario();
        u2.nome = "u1";

        // Comparando usuários:
        System.out.println(u1.equals(u2));

        // Array 1:
        Usuario[] array1 = {u1, u2};

        // criando usuário do array 1:
        Usuario  u3 = new Usuario();
        u3.nome = "u1";
        Usuario  u4 = new Usuario();
        u4.nome = "u1";

        // Array 2:
        Usuario[] array2 = {u3, u4};

        // Comparando arrays:
        System.out.println(Arrays.equals(array1, array2));
    }
}

