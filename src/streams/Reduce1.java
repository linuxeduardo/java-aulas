package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        // REDUCE

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = (ac, at) -> ac + at;

        Integer total = nums.stream().reduce(soma).get(); // reduce é terminal // get the result
        System.out.println(total);

        // parallelStream passa valor inicial para cada elemento
        Integer total2 = nums.stream().reduce(100, soma); // com valor inicial
        // não precisa do get()
        System.out.println(total2);

        // Resultado foi um Optional<Integer>...
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);

    }
}
