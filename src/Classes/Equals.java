package Classes;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();

		u1.nome = "Jose";
		u2.nome = "Jose";
		
		u1.email = "Jose@";
		u2.email = "Jose@";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		
	}

}
