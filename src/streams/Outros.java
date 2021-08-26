package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Outros {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Joe", 7.1);
        Aluno a2 = new Aluno("Maria", 8.1);
        Aluno a3 = new Aluno("Carlos", 7.2);
        Aluno a4 = new Aluno("Carlos", 7.2);
        Aluno a5 = new Aluno("Joe", 7.1);
        Aluno a6 = new Aluno("Mia", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        // Operações intermediárias

        System.out.println("Distinct..");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip and Limit");
        alunos.stream().distinct().skip(2).limit(2)
                .forEach(System.out::println);

        System.out.println("\nTakeWhile");
        alunos.stream().distinct().takeWhile(a -> a.nota >= 8)
                .forEach(System.out::println);
    }
}
