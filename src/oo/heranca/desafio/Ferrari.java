package oo.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari() {
        this(310);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 315;
    }

    @Override
    void acelerar() {
        super.acelerar();
    } // não faz nada
}
