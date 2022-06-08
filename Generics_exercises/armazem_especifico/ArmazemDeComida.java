public class ArmazemDeComida extends Armazem<Comida>{
    @Override
    public void adicionarAoInventario(String nome, Comida valor) {
        super.adicionarAoInventario(nome, valor);
    }

    @Override
    public Comida obterDoInventario(String nome) {
        return (Comida) super.obterDoInventario(nome);
    }

}