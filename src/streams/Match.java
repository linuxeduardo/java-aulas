package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joe", 7.1);
        Aluno a2 = new Aluno("Joe", 8.1);
        Aluno a3 = new Aluno("Joe", 7.1);
        Aluno a4 = new Aluno("Joe", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7.9;
        Predicate<Aluno> reprovado = aprovado.negate();

        // verifica se todos os alunos foram aprovados
        System.out.println(alunos.stream().allMatch(aprovado));

        // algum
        System.out.println(alunos.stream().anyMatch(aprovado));

        // !nenhum
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
