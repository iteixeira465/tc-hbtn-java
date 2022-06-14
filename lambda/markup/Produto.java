import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup;
    public Supplier<Double> precoComMarkup;
    public Consumer<Double> atualizarMarkup = x -> this.percentualMarkup = x;


    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;

        this.percentualMarkup = 10;

        this.precoComMarkup = () -> this.preco * (1 + this.percentualMarkup/100);

    }


    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public double getpercentualMarkup() {
        return percentualMarkup;
    }


    public Supplier<Double> getPrecoComMarkup() {
        return precoComMarkup;
    }


    public Consumer<Double> getAtualizarMarkup() {
        return atualizarMarkup;
    }



}