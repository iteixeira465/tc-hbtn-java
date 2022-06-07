import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> contatos;

    public ListaTelefonica() {
        contatos = new HashMap<>();
    }

    public ListaTelefonica(HashMap<String, HashSet<Telefone>> contatos) {
        this.contatos = contatos;
    }

    public void adicionarTelefone(String nome, Telefone numeroTelefone) {
        HashSet<Telefone> hashSet = new HashSet<>();
        boolean encontrou = false;

        for (Map.Entry<String,HashSet<Telefone>> entry : contatos.entrySet()){
            String key = entry.getKey();
            HashSet<Telefone> value = entry.getValue();
            if (value.contains(numeroTelefone)){
                encontrou = true;
                if (key.equals(nome)){
                    System.out.println("Telefone jah existente para essa pessoa");
                }else {
                    System.out.println("Telefone jah pertence a outra pessoa");
                }
            }
        }
        if (!encontrou){
            if (contatos.containsKey(nome)){
                contatos.get(nome).add(numeroTelefone);
            }else {
                hashSet.add(numeroTelefone);
                contatos.put(nome,hashSet);
            }
        }
    }

    public HashSet<Telefone> buscar(String nome) {
        return contatos.get(nome);
    }

}