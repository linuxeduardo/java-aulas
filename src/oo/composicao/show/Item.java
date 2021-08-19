package oo.composicao.show;

public class Item {
    Produto produto;
    int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Item() {
    }

    double getTotal(){
        return produto.preco * quantidade;
    }
}
