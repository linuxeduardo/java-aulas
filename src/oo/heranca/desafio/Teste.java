package oo.heranca.desafio;

public class Teste {
    public static void main(String[] args) {
        Carro f1 = new Ferrari(400);
        Carro c1 = new Civic();

        c1.acelerar();

        f1.acelerar();
        f1.acelerar();
        f1.acelerar();

        System.out.println(c1.velocidade);
        System.out.println(f1.velocidade);
    }
}
