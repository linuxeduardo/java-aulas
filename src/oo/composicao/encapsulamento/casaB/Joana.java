package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Joana {
	Ana sogra = new Ana();

	void testeDeAcesso() {
//		System.out.println(sogra.segredo);
//		System.out.println(sogra.dentroDeCasa);
//		System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}
}
