package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobrenome;

    public Pessoa(String nome,String sobrenome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSobrenome(sobrenome);
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        if(idade > 0) {
            this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
}
