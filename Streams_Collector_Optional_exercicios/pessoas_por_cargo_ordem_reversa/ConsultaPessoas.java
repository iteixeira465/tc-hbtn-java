import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConsultaPessoas {
   public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> listP){
      Supplier<TreeMap<String, TreeSet<Pessoa>>> map = () -> new TreeMap<>(Comparator.reverseOrder());
      return listP.stream().collect(Collectors.groupingBy(Pessoa::getCargo, map, Collectors.toCollection(TreeSet::new)));
   } 
}