import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> contatos;

    public ListaTelefonica() {
        contatos = new HashMap<>();
    }

    public ListaTelefonica(HashMap<String, ArrayList<Telefone>> contatos) {
        this.contatos = contatos;
    }

    public void adicionarTelefone(String nome, Telefone numeroTelefone) {
        ArrayList<Telefone> list = new ArrayList<>();
        if (contatos.containsKey(nome)){
            contatos.get(nome).add(numeroTelefone);
        }else{
            list.add(numeroTelefone);
            contatos.put(nome,list);
        }
    }

    public ArrayList<Telefone> buscar(String nome) {
        ArrayList<Telefone> list = new ArrayList<Telefone>();
        list = contatos.get(nome);
        return list;
    }
}