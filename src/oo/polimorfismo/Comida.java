package oo.polimorfismo;

public abstract class Comida {
    // abstract não pode ser instanciada
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
