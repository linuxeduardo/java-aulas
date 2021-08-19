package oo.composicao.show;

public class Init {
    public static void main(String[] args) {

        Produto p1 = new Produto("Pao", 2.12);
        Produto p2 = new Produto("Queijo", 12.43);
        Produto p3 = new Produto("Sal", 4.55);


        Cliente c1 = new Cliente("Jak");
        Cliente c2 = new Cliente("Jak");

        c1.compra(new Item(p1, 1));
        c1.compra(new Item(p2, 5));
        c1.compra(new Item(p3, 1));

        c1.remove("dao");
        c1.total();
    }
}
