package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "roxa";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai..");
		case "marrom":
			System.out.println("Sei o Tekki Shodan..");
		case "roxa":
			System.out.println("Sei o Heian Godan..");
		default:
			System.out.println("Nao sei nada..");
		}
	}
}
