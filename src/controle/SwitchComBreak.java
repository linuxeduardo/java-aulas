package controle;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		String conceito =  "";
		int nota = 7;
		
		switch(nota) {
		case 10: case 9: case 8:
			conceito = "A";
			break;
		case 7:
			conceito = "B";
			break;
		} 
		
		System.out.println("Conceito " + conceito);
	}
}
