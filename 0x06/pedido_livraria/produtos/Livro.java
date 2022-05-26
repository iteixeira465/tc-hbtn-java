package produtos;
public class Livro extends Produto{
    private int paginas;
    private String autos;
    private int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autos, int edicao) {
        super(titulo, ano, pais, precoBruto);
        this.paginas = paginas;
        this.autos = autos;
        this.edicao = edicao;
    }


    @Override
    public double obterPrecoLiquido(){
        double preco = precoBruto + (precoBruto * 0.15);
        return preco;
    }
}