package set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais =new TreeSet<>();
        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("São Paulo");
        System.out.println(treeCapitais);
        // retorna o primeiro elemnto
        System.out.println(treeCapitais.first());
        // retorna o ultimo elemnto
        System.out.println(treeCapitais.last());
        //retorna o elemento antes do citado
        System.out.println(treeCapitais.lower("Curitiba"));
        //retorna o elemento depois do citado
        System.out.println(treeCapitais.higher("Curitiba"));
        //remove o primeiro elemento
        System.out.println(treeCapitais.pollFirst());
        //remove o ultimo elemento
        System.out.println(treeCapitais.pollLast());
        //mostra todos elemento
        System.out.println(treeCapitais);


        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()) {
            System.out.println("*" + iterator.next());

        }
        //navega nos elementos
        for (String capitais: treeCapitais) {
            System.out.println(capitais);
        }

    }
}
