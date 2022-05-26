package produtos;
public class Dvd extends Produto{
    private String diretor;
    private String genero;
    private int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        super.precoBruto = precoBruto;
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }


    @Override
    public double obterPrecoLiquido(){
        double preco = precoBruto + (precoBruto * 0.20);
        return preco;
    }
}