package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		String valor = "";

		while (!valor.equalsIgnoreCase("sair")) {

			System.out.println("Digite a palavra sair.");
			valor = e.nextLine();

		}

		e.close();
	}
}
