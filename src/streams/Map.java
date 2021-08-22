package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
public static void main(String[] args) {
	Consumer<String> print = System.out::print;
	
	List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
	
	// map op. intermediária, forEach op. terminal
	marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);
	
//	UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//	UnaryOperator<String> grito = n -> n + "!!!";
	
	System.out.println("\n");
	System.out.println("\nUsando composićão");
	marcas.stream()
	.map(Utilitarios.maiuscula)
	.map(primeiraLetra)
	.map(Utilitarios::grito)
	.forEach(print);
	
}
}
