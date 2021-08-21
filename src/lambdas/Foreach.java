package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        // foreach lambda
        List<String> aprovados = Arrays.asList("avd", "äsf", "poe");

        // tradicional
        for(String n: aprovados) {
            System.out.println(n);
        }

        // lambda 01
        System.out.println("\nLambda #01");
        aprovados.forEach(nome -> System.out.println(nome + "!"));

        // method reference 02
        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);

        // method 03
        System.out.println("\n03");
        aprovados.forEach(nome -> meuImprimir(nome));

        // method 04
        System.out.println("\n04");
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}
