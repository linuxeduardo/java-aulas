package excecao;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;
        try {
            imprimirAluno(a1);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro aqui: " + ex.fillInStackTrace());
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException ex) {
//            ex.printStackTrace();
            System.out.println("Erro: " + ex.getMessage());
        }
        System.out.println("Fim");
    }

    public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
