package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExemploList {
    public static void main(String[] args) {

        List<Estudante> esttudantes = new ArrayList<>();
        esttudantes.add(new Estudante("Pedro",19));
        esttudantes.add(new Estudante("José",29));
        esttudantes.add(new Estudante("Patricia",22));
        esttudantes.add(new Estudante("Paulo",32));
        esttudantes.add(new Estudante("Marcos",18));

        System.out.println("---------ordem de inserção-------------");
        System.out.println(esttudantes);

        esttudantes.sort((first,secund)->first.getIdade()-secund.getIdade());
        System.out.println("---------ordem de idade-------------");
        System.out.println(esttudantes);

        esttudantes.sort((first,secund)->secund.getIdade() - first.getIdade());
        System.out.println("---------ordem inversa de idade-------------");
        System.out.println(esttudantes);

        esttudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("---------ordem metodo reference-------------");
        System.out.println(esttudantes);

        esttudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("---------ordem metodo reference reverso-------------");
        System.out.println(esttudantes);

        Collections.sort(esttudantes);
        System.out.println("---------ordem natural (interface Comparable)------------");
        System.out.println(esttudantes);

        Collections.sort(esttudantes, new EstudanteOrdemReversaComparator());
        System.out.println("---------ordem reversa (interface Comparable)------------");
        System.out.println(esttudantes);



    }
}
