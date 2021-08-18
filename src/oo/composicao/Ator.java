package oo.composicao;

import java.util.Objects;

public class Ator {
	String nome;
	int idade;
	double salario;
	
	Ator() {}
	
	Ator(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	void adicionarSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ator other = (Ator) obj;
		return idade == other.idade && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}
	
	
}
