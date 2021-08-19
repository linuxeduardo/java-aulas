package oo.heranca;

public class Monstro extends Jogador {

    Monstro() {
        this(0,0); // this chama M.super
    }

    Monstro(int x, int y) {
        super(x, y); // super chama classe pai
    }
}
