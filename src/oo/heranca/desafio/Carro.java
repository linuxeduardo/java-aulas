package oo.heranca.desafio;

public class Carro {
    /*
    met acelerar freio+ ++ -- 5 .. 5
    atr velocidade > 0
    ferrari acelerar 15 .. 15
     */
    final int VELOCIDADE_MAXIMA;
    int velocidade;
    private int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar()  {
        if(velocidade + getDelta() > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
            System.out.println(velocidade);
        } else {
            this.velocidade += getDelta();
            System.out.println(velocidade);
        }
    }

    void frear() {
        if(velocidade >= delta) {
            this.velocidade -= delta;
        } else {
            this.velocidade = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
