package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("Caneta", 12.34, .9);
        Produto p2 = new Produto("Borracha", 4.34, 0);
        Produto p3 = new Produto("Caderno", 6.34, .25);
        Produto p4 = new Produto("Lapis", 8.34, .2);
        Produto p5 = new Produto("Lanterna", 19.34, .1);
//        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p3, p2, p4, p5);
//        produtos.forEach(imprimir);

        produtos.forEach(p -> System.out.println(p.nome));
        produtos.forEach(System.out::println);
    }
}
