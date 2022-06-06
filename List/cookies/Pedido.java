import java.util.ArrayList;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int totalCaixas = 0;
        for(PedidoCookie pedidoCookie : this.cookies){
            totalCaixas += pedidoCookie.getQuantidadeCaixas();
        }
        return totalCaixas;
    }

    public int removerSabor(String sabor){
        int totalCaixasrm = 0;
        for (int i =0;i < cookies.size();i++) {
            if (sabor.equals(cookies.get(i).getSabor())){
                totalCaixasrm = totalCaixasrm + cookies.get(i).getQuantidadeCaixas();
                cookies.remove(cookies.get(i));
            }
        }
        return totalCaixasrm;
    }
}