package arrays;

import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {
		System.out.println(" - - - - Exercicios - - - - ");

		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.8;
		notasAlunoA[1] = 8.8;
		notasAlunoA[2] = 4.8;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println("Média do aluno: " + totalAlunoA / notasAlunoA.length);
		
		double[] notasAlunoB = { 4.5, 6.6, 8.8, 10 };
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
