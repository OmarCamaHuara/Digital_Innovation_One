package Map;

import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        // Monta a arvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "Sao Paulo");
        treeCapitais.put("RJ", "Rio Janeiro");
        treeCapitais.put("BH", "Belo Horizontes");

        System.out.println(treeCapitais);

        System.out.println("### Retornando a primeira capital no topo da arvore ###");
        System.out.println(treeCapitais.firstKey());

        System.out.println("### Retorna a ultima capital no final da arvore ###");
        System.out.println(treeCapitais.lastKey());

        System.out.println("### Retorna a primeira capital abaxio na arvore da capital parametrizada ###");
        System.out.println(treeCapitais.lowerKey("SC"));

        System.out.println("### Retorna a primeira capital acima na arvore da papital parametrizada ###");
        System.out.println(treeCapitais.higherKey("SC"));
    }
}
