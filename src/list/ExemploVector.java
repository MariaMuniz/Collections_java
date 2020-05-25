package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("futebol");
        esportes.add("ping-pong");
        esportes.add("futebol de salao");
        esportes.add("basquete");

        System.out.println(esportes);
        //altera o valor da posicão 2
        esportes.set(2, "basebool");
        System.out.println(esportes);
        // retorna o valor da posicão 0
        System.out.println(esportes.get(0));
        // navega nos esportes
        for (String esporte : esportes) {
            System.out.println(esporte);
        }
    }
}
