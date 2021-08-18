package arrays;

import javax.swing.JOptionPane;

public class DesafioNotas {
	public static void main(String[] args) {

		String v1 = JOptionPane.showInputDialog("Quantas notas você quer informar?");

		int quantidade = Integer.parseInt(v1);
		double[] notas = new double[quantidade];

		for (int i = 0; i < quantidade; i++) {
			String nota = JOptionPane.showInputDialog("Qual é a nota?");
			notas[i] = Double.parseDouble(nota);
		}
		
		double total = 0;
		for(double x: notas) {
			total += x;
		}
		double media = total / notas.length;
		
		System.out.println(("A média do aluno é " + media));
		JOptionPane.showInternalMessageDialog(null, "A média do aluno é " + media);
	}

}
