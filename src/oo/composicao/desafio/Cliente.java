package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra c) {
        this.compras.add(c);
    }

    double obterValorTotal() {
        @SuppressWarnings("unused")
		double total = 0;
        System.out.println(this.compras.get(0).items);
        for(Compra c: compras) {
            total += c.obterValorTotal();
        }
        return 0;
    }

}
