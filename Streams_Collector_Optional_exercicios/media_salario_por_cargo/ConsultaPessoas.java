import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConsultaPessoas {
   public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> listP){
      Supplier<TreeMap<String, TreeSet<Pessoa>>> map = () -> new TreeMap<>(Comparator.reverseOrder());
      return listP.stream().collect(Collectors.groupingBy(Pessoa::getCargo, map, Collectors.toCollection(TreeSet::new)));
   } 

   public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
      return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
  }

  public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas) {
   return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));
}

public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoas) {
   return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(Pessoa::getSalario)));
}
}