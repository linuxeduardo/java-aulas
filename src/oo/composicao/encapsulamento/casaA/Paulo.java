package oo.composicao.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeDeAcesso() {
//		System.out.println(esposa.segredo);
		System.out.println(esposa.dentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}
