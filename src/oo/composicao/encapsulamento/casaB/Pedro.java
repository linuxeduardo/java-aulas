package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	Ana mae = new Ana();

	void testeDeAcesso() {
//		System.out.println(mae.segredo);
//		System.out.println(mae.dentroDeCasa);
		System.out.println(formaDeFalar); // acesso via heranca
		System.out.println(todosSabem);
	}
}
