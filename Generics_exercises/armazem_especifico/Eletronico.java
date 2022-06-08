import java.util.Locale;

public class Eletronico {
    private String descricao;
    private double preco;



    public Eletronico(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }



    public String getDescricao() {
        return descricao;
    }



    public double getPreco() {
        return preco;
    }



    @Override
    public String toString(){
        return String.format(Locale.GERMANY,"[%s] R$ %.6f", getDescricao(), getPreco());
    }
}