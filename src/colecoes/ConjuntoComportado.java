package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		// Cannot access by index
		
		// SET
		Set<String> lista = new HashSet<>(); // <Type> Required (Generic)
		lista.add("oi");
		lista.add("oi");
		lista.add("tchau");
		lista.add("até");
		
		// Insert order
		SortedSet<String> lista2 = new TreeSet<>();
		lista2.add("oi");
		lista2.add("oi");
		lista2.add("tchau");
		lista2.add("até");
		
		System.out.println(lista);
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		System.out.println("");
		
		for(String candidato: lista2) {
			System.out.println(candidato);
		}
		
		Set<Integer> n = new HashSet<>();
		n.add(1);
		n.add(32);
		n.add(12);
		n.add(0);
		
		for(Integer x: n) {
			System.out.println(x);
		}
	}
}
