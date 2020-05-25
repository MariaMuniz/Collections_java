package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {


        List<String> nomes =new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Antonia");
        nomes.add("Roberto");
        nomes.add("Guilherme");
        nomes.add("Victor");
        nomes.add("Maria");
        nomes.add("José");

        System.out.println("Contagem :" + nomes.stream().count());
        System.out.println("Maior numero de letras:" + nomes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Menor numero de letras: :" + nomes.stream().min(Comparator.comparingInt(String::length)));
        System.out.println("nome com a letra c :" + nomes.stream().filter((nome)
                -> nome.toLowerCase().contains("c")).collect(Collectors.toList()));
        System.out.println("coleção com a quantidade de letras: :" + nomes.stream().map(nome ->
                nome.concat("-").concat(String.valueOf(nome.length()))).collect(Collectors.toList()));

        System.out.println("coleção com o 4 primeiros elementos: :" + nomes.stream().limit(4).collect(Collectors.toList()));
        //Exibe os elementos no console de depois retorna a mesma coleção
        System.out.println("coleção com todos os elementos :" + nomes.stream().peek(System.out::println).collect(Collectors.toList()));
        System.out.println("Retorna todos os elementos :" );
        nomes.stream().forEach(System.out::println);
        System.out.println("Retorna a true se todos os nomes tiver a letra Z  :" +nomes.stream().allMatch((elemento)->elemento.contains("z")));
        System.out.println("Retorna a true se pelo menos 1 nome tiver a letra a :" +nomes.stream().anyMatch((elemento)->elemento.contains("a")));
        System.out.println("Retorna a true se nenhum dos nomes tiver a letra Z  :" +nomes.stream().noneMatch((elemento)->elemento.contains("z")));
        System.out.println("Retorna primeiro elemento da coleção:");
        nomes.stream().findFirst().ifPresent(System.out::println);

      /////Exemplo de oeração encadeada
        System.out.println("Operação encadeada:");
        System.out.println(nomes.stream()
                .peek(System.out::println)
                .map(nome->nome .concat("-").concat(String.valueOf(nome.length())))
                .peek(System.out::println)
                //.filter((nome) -> nome.toLowerCase().contains("r"))
               // .collect(Collectors.toList()));
               // .collect(Collectors.joining(",")));
              //  .collect(Collectors.toSet()));
                ///agrupa de acordo com a quantidade de letras
                .collect(Collectors.groupingBy(nome->nome.substring(nome.indexOf("-")+ 1))));




    }


}
