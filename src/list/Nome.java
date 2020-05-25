package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Nome {

    public static void main (String[]args){
        List<String> nomes =new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Antonia");
        nomes.add("Roberto");
        nomes.add("Guilherme");
        nomes.add("Victor");
        nomes.add("Maria");
        nomes.add("José");

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        int tamanho =nomes.size();
        System.out.println(tamanho);
        nomes.remove(3);
        System.out.println(nomes);
        String nome =nomes.get(1);
        System.out.println(nome);
        boolean temRicardo =nomes.contains("Ricardo");
        System.out.println(temRicardo);
        for (String nomeDoItem :nomes){
            System.out.println("-"+ nomeDoItem);
        }

       Iterator<String> iterator =nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("*"+ iterator.next());
        }
    }

}
