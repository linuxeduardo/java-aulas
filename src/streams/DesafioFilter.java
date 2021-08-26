package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Curso c1 = new Curso("JAVA", 2020, true);
        Curso c2 = new Curso("Javascript", 2018, true);
        Curso c3 = new Curso("Banco de dados", 2021, false);
        Curso c4 = new Curso("PHP", 2006, true);
        Curso c5 = new Curso("Lógica de programação", 1999, false);
        Curso c6 = new Curso("GO", 2015, false);

        List<Curso> cursos = Arrays.asList(c1,c2,c3,c4,c5,c6);

        Predicate<Curso> atualizado = c -> c.ano > 2010;
        Predicate<Curso> ativo = c -> c.ativo;
        Function<Curso, String> mensagem = c -> "O curso " + c.nome + " está ativo e atualizado.";

        cursos.stream()
                .filter(atualizado)
                .filter(ativo)
                .map(mensagem)
                .forEach(System.out::println);
    }
}
