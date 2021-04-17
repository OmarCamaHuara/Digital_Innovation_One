package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeonesMundialFifa = new HashMap<>();
        // Adicionando os campeones mundiales fifa no map
        campeonesMundialFifa.put("Brasil", 5);
        campeonesMundialFifa.put("Alemania", 4);
        campeonesMundialFifa.put("Italia", 4);
        campeonesMundialFifa.put("Uruguay", 2);
        campeonesMundialFifa.put("Bolivia", 10);
        campeonesMundialFifa.put("Francia", 2);
        campeonesMundialFifa.put("Inglaterra", 1);
        campeonesMundialFifa.put("Espanha", 1);

        System.out.println(campeonesMundialFifa.get("Espanha")+"----------");

        System.out.println("---- Atualizar o valor para a chave Brasil----");
        campeonesMundialFifa.put("Bolivia", 9);
        System.out.println(campeonesMundialFifa);

        System.out.println("---- Retornar Francia ----");
        System.out.println(campeonesMundialFifa.get("Francia"));

        System.out.println("---- Retornar si existe ou nao um campeon Bolivia ----");
        System.out.println(campeonesMundialFifa.containsKey("Bolivia"));

        System.out.println("---- Remove o campeao Francia ----");
        campeonesMundialFifa.remove("Francia");
        System.out.println(campeonesMundialFifa);

        System.out.println("---- Retornar si existe ou nao uma selecao mega campeona ----");
        System.out.println(campeonesMundialFifa.containsValue("Bolivia"));

        System.out.println("---- Retorna o tamanho do mapa ----");
        System.out.println(campeonesMundialFifa.size());
    }
}
