package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Joe", "Lua", "Sol", "Kyo");
		
		// Classic
		System.out.println("Classic looping");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nUsando foreach");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		
		System.out.println("\nUsando Iterator..");
		// has Next ?
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando Stream, laco interno..");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
	}
}








