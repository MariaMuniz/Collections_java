package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHasSet {


    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(9);
        // mantem a ordem de inserção
        System.out.println(sequenciaNumerica);
        System.out.println(sequenciaNumerica.size());
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()) {
            System.out.println("*" + iterator.next());

        }
        //navega nos elementos
        for (Integer notas : sequenciaNumerica) {
            System.out.println(notas);
        }
        //retorna se esta vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
