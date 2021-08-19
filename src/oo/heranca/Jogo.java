package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        Heroi heroi = new Heroi(10, 11);
        monstro.x = 10;
        monstro.y = 10;

        /*
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);
        */

        System.out.println("Mons life: "+monstro.vida);
        System.out.println("Heró life: " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Mons life: "+monstro.vida);
        System.out.println("Heró life: " + heroi.vida);
    }
}
