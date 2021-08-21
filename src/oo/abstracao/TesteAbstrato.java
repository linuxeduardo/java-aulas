package oo.abstracao;

public class TesteAbstrato {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        Mamifero b = new Cachorro();
        a.mover();
        b.mamar();
    }
}
