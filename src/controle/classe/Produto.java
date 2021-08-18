package controle.classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto() {
	}
	
	double precoComDesconto(double descontoDoGerente){
		return preco * (1 - (desconto + descontoDoGerente));
	}
	
	double precoComDesconto(){
		return preco * (1 - desconto);
	}

}
