package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {


    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Marcos");
        filaBanco.add("Janaina");
        filaBanco.add("Roberto");
        filaBanco.add("Ana");
        filaBanco.add("Thales");
        System.out.println(filaBanco);
//poll mostra primeiro da fila e remove
        String clienteASerAtendida = filaBanco.poll();
        System.out.println(clienteASerAtendida);
        System.out.println(filaBanco);
        //peek mostra primeiro da fila mas não remove e null se não tiver elemento nenhum
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
        //retorna o primeiro elemento e exception se não tiver elemento nenhum
        //filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String client : filaBanco) {
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()) {
            System.out.println("*" + iteratorFilaBanco.next());

        }
        //retorna a quantidade de itens
        System.out.println(filaBanco.size());
        //retorna se esta vazio ou não
        System.out.println(filaBanco.isEmpty());
    }

}
