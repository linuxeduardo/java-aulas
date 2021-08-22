package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Binario {
    public static void main(String[] args) {

        /*
         Represents an operation upon 2 operands of the same type, producing a result of the same type as
         the operands. This is a specialization of BiFunction for the case where the operands and the result
         are all of the same type.
         */

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(8.0,9.0));

        /*
        Represents a function that accepts 2 arguments and produces a result. This is the two-arity
        specialization of Function.
         */
        BiFunction<Double, Double, String> resultado =
                (n1, n2) -> ((n1 + n2) / 2 ) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(9.1, 8.9));

        /*
        Represents a function that accepts 1 argument and produces a result.
        This is a functional interface whose functional method is apply (Object).
         */
        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(7.6,4.5));
    }
}
