package controle.classe;

public class Pessoa {
	double peso;
	String nome;

	Pessoa(String nome, double peso) {
		this.peso = peso;
		this.nome = nome;
	}

	void comer(Comida comida) {
		if (comida != null) {

			this.peso += comida.peso;
		}

	}
}
