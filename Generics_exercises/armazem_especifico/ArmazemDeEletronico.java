public class ArmazemDeEletronico extends Armazem<Eletronico>{
    @Override
    public void adicionarAoInventario(String nome, Eletronico valor) {
        super.adicionarAoInventario(nome, valor);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return super.obterDoInventario(nome);
    }

}