package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		// FIFO
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); // false if the queue is full
		fila.offer("Bia"); // if the queue is full, Exception
		fila.offer("Carlos");
		fila.offer("Jill");
		fila.offer("Claire");
		fila.add("Ada");
		
		// if the queue is empty
		System.out.println(fila.peek()); // get the first
		System.out.println(fila.peek()); // if is empty return null
		System.out.println(fila.element()); // if is empty Exception
		
		System.out.println(fila.size());
		// System.out.println(fila.clear());
		System.out.println(fila.isEmpty());
		System.out.println(fila.poll()); // get the first and remove
		System.out.println(fila.poll()); // return null if is empty
		System.out.println(fila.remove()); // if is empty Exception
		
		// fila.contains()
		// fila.addAll()
	}
}
