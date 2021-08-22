package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		// Custom print
		Consumer<String> print = System.out::print;
		@SuppressWarnings("unused")
		Consumer<Integer> println = System.out::println;

		Stream<String> langs = Stream.of("Java ", "Python ", "Lua ", "C++ \n");
		langs.forEach(print);
		
		String[] maisLangs = { "C# ", "Go ", "Lisp ", "Perl\n" };
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print); // Index
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
//		Stream.generate(() -> "a").forEach(print); // infinity
//		Stream.iterate(0, n -> n + 1).forEach(println); // infinity
		// 0 + 1; 1 + 1; 2 + 1
		
	
	}

}
