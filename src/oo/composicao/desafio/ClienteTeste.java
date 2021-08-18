package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 21.3);
        Produto feijao = new Produto("Feijao", 8.7);
        Produto doce = new Produto("Doce", 0.11);

        Cliente oro = new Cliente("Oro");

        Compra compra1 = new Compra();

        compra1.adicionarItem(arroz, 1);
        compra1.adicionarItem(doce, 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem(feijao, 4);


        oro.compras.add(compra1);
        oro.adicionarCompra(compra2);

        System.out.println(compra2.obterValorTotal());
        System.out.println(oro.obterValorTotal());
    }
}
