import java.util.Locale;

public class Comida {
    private String nome;
    private double calorias;
    private double preco;


    public Comida(String nome, double calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public double getCalorias() {
        return calorias;
    }
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString(){
        return String.format(Locale.GERMANY,"[%s] %.6f R$ %.6f", getNome(), getCalorias(), getPreco());
    }

}