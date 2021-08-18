package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		
		final double AJUSTE = 32.0;
		final double FATOR = 5.0/9.0;
		
		double farenheit = 100;
		
		double celsius = (farenheit - FATOR) * AJUSTE;
		
		System.out.println(celsius);
	}

}
