import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] numeros){
        TreeSet<Integer> treeset = new TreeSet<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int n : numeros){
            if(hashSet.contains(n)){
                treeset.add(n);
            }
            hashSet.add(n);
        }

        return treeset;
    }
}