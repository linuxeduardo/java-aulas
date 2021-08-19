package oo.heranca.desafio;

public class Carro {
    /*
    met acelerar freio+ ++ -- 5 .. 5
    atr velocidade > 0
    ferrari acelerar 15 .. 15
     */
    final int VELOCIDADE_MAXIMA;
    int velocidade;
    int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar()  {
        if(velocidade + delta > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            this.velocidade += delta;
        }
    }

    void frear() {
        if(velocidade >= delta) {
            this.velocidade -= delta;
        } else {
            this.velocidade = 0;
        }
    }
}
