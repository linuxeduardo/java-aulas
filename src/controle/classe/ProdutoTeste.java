package controle.classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Note2");
		p1.nome = "Note";
		p1.preco = 1000.00;
		p1.desconto = 0.10;
		
		Produto p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 799.88;
		p2.desconto = 0.15;
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.precoComDesconto(0.1));
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.nome);
	}
}
