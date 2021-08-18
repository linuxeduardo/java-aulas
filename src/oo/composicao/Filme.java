package oo.composicao;

import java.util.ArrayList;

public class Filme {
	String nome;
	int ano;
	ArrayList<Ator> atores = new ArrayList<Ator>();

	public Filme(String nome, int ano) {
		this.nome = nome;
		this.ano = ano;
	}

	void adicionarAtor(Ator ator) {
		this.atores.add(ator);
	}

	boolean removerAtor(String nome) {
		for (Ator ator : atores) {
			if (ator.nome != null) {
				boolean encontrado = nome.toLowerCase().equals(ator.nome.toLowerCase());
				return encontrado;
			}
		}
		return false;
	}

	ArrayList<Ator> lista() {
		return atores;
	}

	void adicionarAtor(String nome, int ano) {
		this.adicionarAtor(new Ator(nome, ano));
	}

	@Override
	public String toString() {
		return "O filme é " + this.nome;
	}
}
