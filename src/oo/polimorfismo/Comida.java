package oo.polimorfismo;

public class Comida {
    private double peso;

    // Polymorphism dynamic
    public Comida(double peso) {
        this.setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
}
