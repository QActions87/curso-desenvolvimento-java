import java.util.Objects;

public class Usuario {
    public String nome;
    public String email;
    public String senha;

    // Representação textual dos atributos:
    public String toString() {
        return "{ Nome: " + nome + ", Email: " + email + ", Senha: " + senha +" }";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}


