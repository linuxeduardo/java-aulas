package colecoes;

import java.util.ArrayList;

public class Listas {
	public static void main(String[] args) {
		// List<Usuario>..
		ArrayList<Usuario> lista = new ArrayList<>();

		lista.add(new Usuario("Jorge"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Joao"));
		lista.add(new Usuario("Jorge"));
		lista.add(new Usuario("Jorge"));

		System.out.println(lista.get(3).nome);
		System.out.println(lista.get(3)); // access by index

		System.out.println("");

		// hash code and equals required, right click source generate.
		lista.remove(1);
		System.out.println(lista.remove(1));
		lista.remove(new Usuario("Jorge"));
		System.out.println(lista.remove(new Usuario("Jorge")));
		System.out.println(lista.contains(new Usuario("Bia")));

		System.out.println("");

		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
	}
}
