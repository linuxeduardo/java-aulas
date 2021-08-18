package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		// LIFO
		// last in first out
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe"); // return boolean
		livros.push("O senhor dos anéis"); // return null, if full Exception
		livros.push("Dom quixote");
		livros.push("O Hobbit");
		livros.push("O Hobbit 2");
		livros.push("O Hobbit 3");
		livros.push("O Hobbit 4");
		livros.push("O Hobbit 5");
		
		// peek and element
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.remove()); // if null Exception
		System.out.println(livros.pop()); // if null Exception
		
		// .size .clear .contains .isEmpty
		livros.getLast();
		
		System.out.println();
		for(String livro: livros) {
			System.out.println(livro);
		}
	}
}
