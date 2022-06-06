import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public int obterPosicaoContato(String nome){
        for(Contato contato : this.contatos){
            if(contato.getNome().equals(nome)){
                return this.contatos.indexOf(contato);
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato) throws Exception{
        if(obterPosicaoContato(contato.getNome()) != -1){
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }

        this.contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato contatoNovo) throws Exception{
        if(obterPosicaoContato(contatoAntigo.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
        if(obterPosicaoContato(contatoNovo.getNome()) != -1 && obterPosicaoContato(contatoNovo.getNome()) != obterPosicaoContato(contatoAntigo.getNome())){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        this.contatos.set(obterPosicaoContato(contatoAntigo.getNome()), contatoNovo);
    }

    public void removerContato(Contato contato) throws Exception{
        if(obterPosicaoContato(contato.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
        this.contatos.remove(obterPosicaoContato(contato.getNome()));
    }

    public void listarContatos(){
        for(Contato contato : contatos){
            System.out.printf("%s -> %s (%s)%n", contato.getNome(), contato.getNumero(), contato.getTipoNumero());
        }
    }
}