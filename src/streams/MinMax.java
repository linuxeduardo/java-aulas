package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joe", 7.3);
        Aluno a2 = new Aluno("Mia", 8.1);
        Aluno a3 = new Aluno("Lia", 6.8);
        Aluno a4 = new Aluno("Ivi", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            // usando lambda
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}
