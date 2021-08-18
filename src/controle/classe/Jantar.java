package controle.classe;

public class Jantar {
	public static void main(String[] args) {
		Comida lasanha = new Comida("Lasanha", 3.4);
		Comida hamburguer = new Comida("Hamburguer", 0.5);
		
		Pessoa jorge = new Pessoa("Jorge", 50);
		Pessoa lucia = new Pessoa("Lucia", 50);
		
		jorge.comer(lasanha);
		lucia.comer(hamburguer);
		lucia.comer(hamburguer);
		lucia.comer(hamburguer);
		lucia.comer(hamburguer);
		lucia.comer(hamburguer);
		
		System.out.println(jorge.peso);
		System.out.println(lucia.peso);
	}
}
