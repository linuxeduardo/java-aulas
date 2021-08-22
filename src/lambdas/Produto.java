package lambdas;

public class Produto {
    final public String nome;
    final public double preco;
    final public double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return nome + " tem preço " + preco + " e com desconto é " + precoFinal;
    }
}
