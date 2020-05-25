package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais= new TreeMap<>();
        treeCapitais.put("SP","Sao Paulo" );
        treeCapitais.put("RJ","Rio de Janeiro");
        treeCapitais.put("MG","Minas Gerais");
        treeCapitais.put("DF","Distrito Federal");
        treeCapitais.put("SC","Santa Catarina");
        System.out.println(treeCapitais);

        //primeiro
        System.out.println(treeCapitais.firstKey());
        //ultimo
        System.out.println(treeCapitais.lastKey());
        //antes do citado
        System.out.println(treeCapitais.lowerKey("RJ"));
        //depois do citado
        System.out.println(treeCapitais.higherKey("RJ"));
        //navega entre as capitais
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()) {
           String key= iterator.next();

            System.out.println(key + "*" + treeCapitais.get(key));
        }
        for (String capital:treeCapitais.keySet()){
            System.out.println(capital + "*" + treeCapitais.get(capital));
        }
        for (Map.Entry<String, String> capital : treeCapitais.entrySet()){
            System.out.println(capital.getKey() + "--" + capital.getValue());
        }

      Map.Entry<String,String> firstEntry= treeCapitais.pollFirstEntry();
        Map.Entry<String,String> lastEntry= treeCapitais.pollLastEntry();
        //remove o primeiro item
        System.out.println(firstEntry.getKey()+"--"+firstEntry.getValue());
        //remove o ultimo item
        System.out.println(lastEntry.getKey()+"--"+lastEntry.getValue());

        System.out.println(treeCapitais);
    }
    }


