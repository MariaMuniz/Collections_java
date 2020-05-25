package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {


    public static void main(String[] args) {
        Set<Double> notaAlunos = new HashSet<>();
        notaAlunos.add(4.8);
        notaAlunos.add(8.0);
        notaAlunos.add(6.5);
        notaAlunos.add(9.4);
        notaAlunos.add(8.5);
        notaAlunos.add(3.4);
        //nao mantem a ordem de inserção
        System.out.println(notaAlunos);
       notaAlunos.remove(8.0);
        System.out.println(notaAlunos);
        System.out.println(notaAlunos.size());

        Iterator<Double> iterator = notaAlunos.iterator();
        while (iterator.hasNext()) {
            System.out.println("*" + iterator.next());

        }
        //navega nos elementos
        for (Double notas : notaAlunos) {
            System.out.println(notas);
        }
        //retorna se esta vazio ou não
        System.out.println(notaAlunos.isEmpty());
    }
}
