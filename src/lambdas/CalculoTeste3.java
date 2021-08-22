package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        // função anônima, LAMBDA, mesmos args do método de Calculo
        // com chaves tem que ter o return
        BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.apply(2.0,3.0));

        // sem as chaves, 1 sentença e será retornada
        calculo = (x, y) -> x * y;
        System.out.println(calculo.apply(2.0,3.0));

        // Não converte int -> Double
        // double -> Double

        BinaryOperator<Integer> calculo2 = (x, y) ->  x + y;
        System.out.println(calculo2.apply(2,3));

        // sem as chaves, 1 sentença e será retornada
        calculo = (x, y) -> x * y;
        System.out.println(calculo2.apply(2,3));

    }
}
