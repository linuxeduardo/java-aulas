package fundamentos;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		
		double raio = 3.5;
		final double PI = 3.14159; // constant
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área " + area);
		
		// jshell
		
	}
}
