package oo.composicao.show;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Item> compras = new ArrayList<>();

    Cliente(){}
    Cliente(String nome){
        this.nome = nome;
    }

    void compra(Item p){
        System.out.println(p.produto.nome + " adicionado a sua lista;");
        compras.add(p);
    }

    void remove(String nome) {
        int index = 0;
        for(Item c: compras) {
            boolean found = c.produto.nome.equals(nome);
            index++;
            if(found) {
                compras.remove(index);
                System.out.println("Item removido.");
            }
        }
    }

    void lista() {
        double total = 0;
        int i = 0;
        System.out.println("Lista de compras: - - - - - - - - - - - - - - -|");
        for(Item c: compras) {
            System.out.println(i + ": " + c.produto.nome + ", preço: " + this.formatarValor(c.produto.preco) +
                    ", quantidade: " + c.quantidade);
            total += c.produto.preco;
            i++;
        }
    }

    double total() {
        double total = 0;
        for(Item i: compras) {
            total += i.getTotal();
        }
        this.lista();
        System.out.println("Valor total da compra: " + this.formatarValor(total));
        return total;
    }

    String formatarValor(double valor) {
        double v = valor * 100;
        v = Math.round(v);
        v = v / 100;
        return "R$" + v;
    }
}
