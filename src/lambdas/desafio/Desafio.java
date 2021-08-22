package lambdas.desafio;

import lambdas.Produto;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Produto produto = new Produto("Ipad", 3235.89, 0.13);

        /*
        1 calcular o preco com desconto
        2 imposto municipal >= 2500 (8.5%) / < 2500 isento
        3 frete >= 3000 (100) / < 3000 (50)
        4 arredondar 2 casas
        5 formatar R$0000,00
         */

        Function<Produto, Double> desconto = p ->  p.preco * (1 - p.desconto);
        Function<Produto, Double> imposto = p ->
            p.preco >= 2500 ? p.preco * (1 + 8.5) : p.preco;
        Function<Produto, Double> frete = p ->
                p.preco >= 300 ? p.preco + 100 : p.preco + 50;
        Function<Produto, Double> decimais = p -> {
            double resultado = p.preco * 100;
            resultado = Math.round(resultado);
            resultado = resultado / 100;
            return  resultado;
        };
        Function<Produto, String> formatar = p -> "R$"+p.preco;

        Function<Produto, Double> precoFinal =
                p -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoMunicipal =
                p -> p >= 2500 ? p * (1.085) : p;
        UnaryOperator<Double> fretes =
                p -> p >= 3000 ? p + 100 : p + 50;
        UnaryOperator<Double> arredondar =
                p -> Double.parseDouble(String.format("%.2f", p));
        Function<Double, String> format =
                p -> ("R$"+p).replace(".", ",");

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(fretes)
                .andThen(arredondar)
                .andThen(format)
                .apply(produto);
        System.out.println("O preço final é " + preco);
    }
}
