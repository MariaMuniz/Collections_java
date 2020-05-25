package optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivo {


    public static void main(String[] args) {

        System.out.println("valor inteiro");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("valor double");
        OptionalDouble.of(12.6).ifPresent(System.out::println);

        System.out.println("valor Long");
        OptionalLong.of(12L).ifPresent(System.out::println);
    }
}
