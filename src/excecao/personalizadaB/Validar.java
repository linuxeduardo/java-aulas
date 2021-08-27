package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {

    private Validar(){}

    public static void aluno(Aluno aluno) throws StringVaziaEx, NumeroForaDoIntervaloEx {
        if(aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo.");
        }

        if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaEx("Nome");
        }

        if(aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaDoIntervaloEx("Nota");
        }
    }
}
