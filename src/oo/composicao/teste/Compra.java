package oo.composicao.teste;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> lista = new ArrayList<>();

    void adicionarItem(Item i) {
        this.lista.add(i);
    }

    void printLista(){
        for (Item i: lista) {
            System.out.println("Nome: " + i.produto.nome +
                    ", Preço: " + i.produto.preco);
        }
    }

    void valorTotal(){
        double total = 0;
        for (Item i: lista) {
           total += i.produto.preco * i.quantidade;
        }
        System.out.printf("Valor total: %.2f.", total);

    }
}
