public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> list, Integer posicao) {

        for (Integer integer : list) {
            if (integer.equals(posicao)){
                return list.indexOf(integer);
            }
        }
        return -1;
    }
}