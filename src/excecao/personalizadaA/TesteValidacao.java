package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacao {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Jill", 4);

        try {
            Validar.aluno(aluno);
            Validar.aluno(null);
        } catch (StringVaziaEx | NumeroForaDoIntervaloEx e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println("FIM");
    }
}
