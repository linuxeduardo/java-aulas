package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> items = new ArrayList<>();

    void adicionarItem(Produto p, int q) {
        this.items.add(new Item(p, q));
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        this.items.add(new Item(new Produto(nome, preco), quantidade));
    }

    double obterValorTotal() {
        double total = 0;
        for (Item item: items) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }

}
