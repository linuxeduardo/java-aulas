package oo.abstracao;

public abstract class Mamifero extends Animal {

    // final não pode ser sobrescrito
    public final String mover() {
        return "moveu";
    }

    public abstract void mamar();
}
