package lambdas;

import java.util.function.UnaryOperator;

public class Unario {
    public static void main(String[] args) {

        /*
        Represents an operation on a single operand that produces a result of the same type as its operand.
        This is a specialization of Function for the case where the operand and result are of the same type.
         */
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1=maisDois.andThen(vezesDois)
                .andThen(aoQuadrado).apply(2);
        System.out.println(resultado1);

        // começa pelo último .compose
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(2);
        System.out.println(resultado2);
    }
}
