public class ComparandoObjetos {
    public static void main(String[] args) {
        // criando usuário:
        Usuario  u1 = new Usuario();
        u1.nome = "u1";
        Usuario  u2 = new Usuario();
        u2.nome = "u2";
        // Comparando usuários:
        System.out.println(u1.equals(u2));
    }
}

