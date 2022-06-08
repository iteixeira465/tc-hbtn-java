import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {

    ArrayList<T> list = new ArrayList<>();

    public void adicionarMidia(T midia) {
        this.list.add(midia);
    }

    public ArrayList<T> obterListaMidias() {
        return list;
    }

}