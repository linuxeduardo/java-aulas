package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		

		System.out.println("hoje".repeat(4));
		System.out.println("hoje".charAt(1));
		System.out.println("hoje".length());

		byte anos = 3;
		short numeroDeVoo = 500;
		int id = 98759823;
		long pontosAcumulados = 3_100_345_859L;
		// L over integer capacity

		float salario = 11_993.44F;
		double vendasAcumuladas = 2_848_128_129.91;

		boolean estaDeFerias = false;

		char status = 'T';

		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(numeroDeVoo / 2);
		System.out.println(anos * 365);
		System.out.println("id " + id);
		System.out.println("Ferias " + estaDeFerias);
		System.out.println("Status " + status);
		System.out.println("Salario" + salario);

	}
}
