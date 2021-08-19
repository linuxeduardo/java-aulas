package oo.composicao.teste;

public class Start {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Robert");

        Produto p1 = new Produto("Maça", 2.3);
        Produto p2 = new Produto("Pera", 10.3);
        Produto p3 = new Produto("Cha", 5.34);

        Compra x1 =new Compra();
        x1.adicionarItem(new Item(p1, 2));
        x1.adicionarItem(new Item(p2, 4));
        x1.adicionarItem(new Item(p3, 1));

        x1.printLista();
        x1.valorTotal();

    }

}
