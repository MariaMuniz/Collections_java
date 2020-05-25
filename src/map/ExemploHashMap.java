package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {


        public static void main(String[] args) {

            Map<String, Integer> campeosFifaMundial= new HashMap<>();
            campeosFifaMundial.put("Brasil", 5);
            campeosFifaMundial.put("Alemanha", 4);
            campeosFifaMundial.put("Italia", 4);
            campeosFifaMundial.put("Uruguai", 2);
            campeosFifaMundial.put("Argentina", 2);
            campeosFifaMundial.put("Inglaterra", 1);
            campeosFifaMundial.put("Espanha", 1);
            System.out.println(campeosFifaMundial);
             //atualiza o valor para a chave  Brasil
            campeosFifaMundial.put("Brasil", 6);
            System.out.println(campeosFifaMundial);

            System.out.println(campeosFifaMundial.containsKey("França"));
            System.out.println(campeosFifaMundial.containsValue(2));
            System.out.println(campeosFifaMundial.remove("Espanha"));
            System.out.println(campeosFifaMundial.get("Italia"));

            System.out.println(campeosFifaMundial.size());


            for (String key : campeosFifaMundial.keySet()){
                System.out.println(key +"--" + campeosFifaMundial.get(key));

            }

            for (Map.Entry<String,Integer> entry: campeosFifaMundial.entrySet()){

                System.out.println(entry.getKey()+"---" + entry.getValue());

            }

            campeosFifaMundial.clear();

            System.out.println(campeosFifaMundial.size());
        }
        }
