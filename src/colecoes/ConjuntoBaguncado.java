package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// HASH
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add("Teste");
		conjunto.add(true); // boolean > Boolean
		conjunto.add(2); // boolean > Boolean
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.size());
		
		
		System.out.println(conjunto.contains(1.2));
		
		// SET
		Set ns = new HashSet();
		
		ns.add(12);
		ns.add(5);
		ns.add(7);
		ns.add(2);
		ns.add(2);
		
		System.out.println(ns);
		
		conjunto.addAll(ns); // Union 2 groups
		
		System.out.println(conjunto);
		
		conjunto.retainAll(ns);
		System.out.println(conjunto + " > retain");
		
		conjunto.clear();
		
	}
}
