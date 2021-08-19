package oo.composicao;

public class Carro {
	// relation 1 : 1
	// 1 car 1 motor
	public Motor motor = new Motor();

	public void acelerar() {
		if (motor.fatorInjecao < 2.5) {
			motor.fatorInjecao += 0.4;
		}
	}

	public void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}

	public void ligar() {
		motor.ligado = true;
	}

	public void desligar() {
		motor.ligado = false;
	}

	public boolean estaLigado() {
		return motor.ligado;
	}
}
