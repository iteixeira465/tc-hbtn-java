import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;


    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nome){
        for(Agencia agencia : agencias){
            if(agencia.getNome().equals(nome)){
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nome){
        if(buscarAgencia(nome) == null){
            this.agencias.add(new Agencia(nome));
            return true;
        }
        return false;
    }

    public boolean adicionarCliente(String nomeA, String nomeC, double valor){
        Agencia agencia = buscarAgencia(nomeA);
        if(agencia != null && agencia.buscarCliente(nomeC) == null){
            agencia.novoCliente(nomeC, valor);
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeA, String nomeC, double valor){
        Agencia agencia = buscarAgencia(nomeA);
        if (agencia != null) {
            agencia.adicionarTransacaoCliente(nomeC, valor);
        }
        return false;
    }

    public void listarClientes(String nomeA, boolean imprimeTransacoes) {
        Agencia agencia = buscarAgencia(nomeA);

        if (agencia != null) {
            int i = 1;
            for (Cliente cliente : agencia.getClientes()) {
                System.out.println("Cliente: " + cliente.getNome() + " [" + i + "]");
                i++;
                if (imprimeTransacoes) {
                    int j = 1;
                    for (Double transacao : cliente.getTransacoes()) {
                        System.out.println("  [" + j + "] valor " + transacao);
                        j++;
                    }
                }
            }
        }
    }
}