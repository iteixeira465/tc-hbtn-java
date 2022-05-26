import produtos.Produto;
public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;
    private double total;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        for (ItemPedido item : itens) {
            total = total + (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
        }
        return (total - total * this.percentualDesconto/100);
    }

    public void apresentarResumoPedido(){
        double sDesconto = 0;
        System.out.println("------- RESUMO PEDIDO -------");
        for(ItemPedido item : itens){
            total = item.getQuantidade() * item.getProduto().obterPrecoLiquido();
            sDesconto += total;
            System.out.printf(java.util.Locale.GERMANY,"Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f%n", item.getProduto().getClass().getSimpleName(), item.getProduto().getTitulo(), item.getProduto().obterPrecoLiquido(), item.getQuantidade(), total);
        }

        System.out.println("----------------------------");
        double desconto = sDesconto * (getPercentualDesconto()/100);
        System.out.printf(java.util.Locale.GERMANY, "DESCONTO: %.2f\n", desconto);
        System.out.printf(java.util.Locale.GERMANY, "TOTAL PRODUTOS: %.2f\n", sDesconto);
        System.out.println("----------------------------");
        System.out.printf(java.util.Locale.GERMANY, "TOTAL PEDIDO: %.2f\n", sDesconto-desconto);
        System.out.println("----------------------------");

    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }


}