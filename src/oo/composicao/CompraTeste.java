package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Joana";
		
		compra1.items.add(new Item("Borracha", 3, 14.56));
		compra1.items.add(new Item("Caderno", 1, 44.56));
		compra1.adicionarItem(new Item("Caneta", 19, 4.56));
		compra1.adicionarItem(new Item("Lapis", 120, 1.56));
		compra1.adicionarItem("Tesoura", 1, 0.56);
		
		System.out.println(compra1.items.size());
		System.out.println(compra1.obterValorTotal());
		
		// bidirectional relationship
//		compra1.items.get(0).compra.items.get(1).compra.obterValorTotal();
	}
}
