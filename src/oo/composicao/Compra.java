package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	// relation 1 : N
	// 1 buy : N items
	String cliente;
	ArrayList<Item> items = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		this.items.add(item);
		item.compra = this; // link item to cart
	}
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: items) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
	
	
}
