package fundamentos;

import java.util.Scanner;

public class Wrapper {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		// byte
		Byte b = 1;
		Short s = 1000;
//		Integer i = Integer.parseInt(entrada.next());
		Integer i = 1000;
		Long l = 1000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
//		System.out.println(i);
		System.out.println(l / 3.0);

		entrada.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c  = '#'; // char
		System.out.println(c.toString());
		
	}
}
