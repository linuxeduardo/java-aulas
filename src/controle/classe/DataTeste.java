package controle.classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		d1.ano = 2003;
		d1.mes = 12;
		d1.dia = 31;
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf(d1.obterDataFormatada());
	}
}
