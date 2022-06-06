import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String nome){
        for(Cliente cliente : clientes){
            if(cliente.getNome().equals(nome)){
                return cliente;
            }

        }
        return null;
    }

    public boolean novoCliente(String nome, double valor){
        if(buscarCliente(nome) == null){
            this.clientes.add(new Cliente(nome, valor));
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nome, double valor){
        Cliente cliente = this.buscarCliente(nome);
        if(buscarCliente(nome) != null){
            cliente.adicionarTransacao(valor);
            return true;
        }
        return false;
    }


}