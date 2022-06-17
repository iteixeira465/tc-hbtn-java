import java.io.Serializable;
public class Estudante implements Serializable{
    private int idade;
    private String nome;
    private transient String senha;

    public Estudante(int idade, String nome, String senha) {
        this.idade = idade;
        this.nome = nome;
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Estudante { " + "nome='" + this.nome + "', idade='" + this.idade + "', senha='" + this.senha + "' }";
    }
}