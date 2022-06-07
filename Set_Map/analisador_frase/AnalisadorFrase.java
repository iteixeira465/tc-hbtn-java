import java.util.TreeMap;
public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> mapP = new TreeMap<String, Integer>();

        String fraseT = frase.replaceAll("[?!.]", "");
        String[] p = fraseT.split(" ");

        for (String palavra : p) {
            if (mapP.containsKey(palavra.toLowerCase())) {
                mapP.put(palavra.toLowerCase(), mapP.get(palavra.toLowerCase()) + 1);
            } else {
                mapP.put(palavra.toLowerCase(), 1);
            }
        }
        return mapP;
    }
}