package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Jorge", 9.8);
        Aluno a3 = new Aluno("Diana", 6.8);
        Aluno a4 = new Aluno("Lucas", 4.8);
        Aluno a5 = new Aluno("Zen", 6.3);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        Predicate<Aluno> aprovado = x -> x.nota > 6.0;
        Function<Aluno, String> mensagem = a -> "Parabéns " + a.nome  + ", aprovado!";

        alunos.stream()
                .filter(aprovado)
                .map(mensagem)
                .forEach(System.out::println);
    }
}
