package one.innovation.digital.streamecollection.map.aulas;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        //Adiciona os campeões mundiais fifa no mapa
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Italia", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println(campeoesMundiaisFifa);

        //Atualiza o valor para a chave Brasil
        campeoesMundiaisFifa.put("Brasil", 6);
        System.out.println(campeoesMundiaisFifa);

        // Retorna a Argentina
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        // Retorna se exise ou não um campeão Argentina
        System.out.println(campeoesMundiaisFifa.containsKey("Argentina"));

        // Remove o campeão França
        campeoesMundiaisFifa.remove("França");
        System.out.println(campeoesMundiaisFifa);

        // Retorna se existe ou não um campeão França
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        // Retorne se existe ou não ou não alguma seleção hexacampeã
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println(campeoesMundiaisFifa.size());

        // Navega nos registros do mapa
        for (String key : campeoesMundiaisFifa.keySet()) {
            System.out.println(key + "--" + campeoesMundiaisFifa.get(key));
        }

        // Navega nos registros do mapa mais performatica
        for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        // Verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeoesMundiaisFifa.containsKey("Estados Unidos"));

        // Verifica se o mapa contem o valor 5
        System.out.println(campeoesMundiaisFifa.containsValue(5));

        // Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundiaisFifa.size());
        campeoesMundiaisFifa.clear();
        System.out.println(campeoesMundiaisFifa.size());
    }
}
