package oo.heranca.desafio;

public interface Luxo {

    // public e abstract por padrão
    void ligarAr();
    void desligarAr();
    // method default se não for reimplementada
    default int velocidadeDoAr() {
        return 1;
    }

}
