package fundamentos;

import java.util.Scanner;

public class Console {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia\n");

		System.out.println("Bom");
		System.out.println(" dia");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salario: %.1f%n", 1234.456);
		System.out.printf("Nome: %s%n", "Joao");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu nome: ");
		int idade = entrada.nextInt();
		
		System.out.println("\nNome: " + nome);
		
		entrada.close();
	}
}
