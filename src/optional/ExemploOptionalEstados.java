package optional;

import java.util.*;

public class ExemploOptionalEstados {


    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("valor presente");
        System.out.println("valor optional presente");

        optionalString.ifPresentOrElse(System.out::println, ()-> System.out.println("não esta presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("valor optional não presente");
        optionalNull.ifPresentOrElse(System.out::println, ()-> System.out.println("null = não esta presente"));

        Optional<String> empatyOptional =Optional.empty();
        System.out.println("valor optional não esta presente");
        empatyOptional.ifPresentOrElse(System.out::println, ()-> System.out.println("empaty = não esta presente"));

        Optional<String> OptionalNullErro =Optional.of(null);
        System.out.println("valor optional lança erro NullPointException");
        empatyOptional.ifPresentOrElse(System.out::println, ()-> System.out.println("erro = não esta presente"));
    }
    }
