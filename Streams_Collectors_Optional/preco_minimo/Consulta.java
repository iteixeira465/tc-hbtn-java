import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> produtos = pedido.getProdutos();

        return produtos.stream()
            .filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO))
            .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        Optional<Produto> produtosMaiorPreco = produtos.stream().max(Comparator.comparingDouble(Produto::getPreco));
        return produtosMaiorPreco.orElse(null);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMin){
      return produtos.stream()
            .filter(p -> p.getPreco()>=precoMin)
            .collect(Collectors.toList());
    }
}