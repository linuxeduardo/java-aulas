package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        /*
        Represents a supplier of results.
        There is no requirement that a new or distinct result be returned each time the supplier is invoked.
        This is a functional interface whose functional method is get().
         */
        Supplier<List<String>> umLista =
                () -> Arrays.asList("Ana", "Gui", "Joe");

        System.out.println(umLista.get());
    }
}
