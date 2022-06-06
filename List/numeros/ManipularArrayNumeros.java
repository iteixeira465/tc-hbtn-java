import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> list, Integer number) {
        for (Integer integer : list) {
            if (integer.equals(number)){
                return list.indexOf(integer);
            }
        }
        return -1;
    }


    public static void adicionarNumero(List<Integer> l, Integer n) throws Exception{
        if(buscarPosicaoNumero(l, n) != -1){
            throw new Exception("Numero jah contido na lista");
        }
        l.add(n);
    }

    public static void removerNumero(List<Integer> l, Integer n) throws Exception{
        if(buscarPosicaoNumero(l, n) == -1){
            throw new Exception("Numero nao encontrado na lista");
        }
        l.remove(n);
    }

    public static void substituirNumero(List<Integer> l, Integer numeroSubstituir, Integer numeroSubstituto){
        if(buscarPosicaoNumero(l, numeroSubstituir) == -1){
            l.add(numeroSubstituto);
        } else {
            l.set(l.indexOf(numeroSubstituir), numeroSubstituto);
        }
    }
}