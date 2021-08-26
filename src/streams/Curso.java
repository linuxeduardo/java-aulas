package streams;

public class Curso {
    final String nome;
    final  int ano;
    final boolean ativo;

    public Curso(String nome, int ano, boolean ativo) {
        this.nome = nome;
        this.ano = ano;
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", ativo=" + ativo +
                '}';
    }
}
