package oo.heranca.desafio;

public class TesteCarro {
    public static void main(String[] args) {
        Ferrari f1 = new Ferrari(400);
        Carro c1 = new Civic();

        c1.acelerar();

        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        f1.ligarTurbo();
        f1.acelerar();
        f1.ligarAr();
        f1.acelerar();
        f1.velocidadeDoAr();
        System.out.println(f1.velocidadeDoAr());

        f1.desligarAr();

//        System.out.println(c1.velocidade);
//        System.out.println(f1.velocidade);
    }
}
