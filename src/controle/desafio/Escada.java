package controle.desafio;

public class Escada {
	public static void main(String[] args) {
		
		String valor = "#";
		for (;!valor.equals("#####");) {

			System.out.println(valor);
			valor += "#";
		}
	}
}
