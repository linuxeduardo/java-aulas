package oo.heranca;

public class Heroi extends Jogador {

    Heroi(int x, int y) {
        super(x,y); // chama construtor da classe pai
    }

    boolean atacar(Jogador oponente) {
        boolean at1 = super.atacar(oponente); // herdado do pai
        boolean at2 = super.atacar(oponente);
        return at1 || at2;
    }
}
