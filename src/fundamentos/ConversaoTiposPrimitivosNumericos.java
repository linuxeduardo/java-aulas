package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		double a = 1; // implied
		System.out.println(a);
		
		float b = (float) 1.1234567890; // explicit
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c; // explicit
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; // explicit
		System.out.println(f);
	}
}
