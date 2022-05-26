import produtos.Produto;
public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens) {
            total = total + (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
        }
        return (total - total * this.percentualDesconto/100);
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }


}