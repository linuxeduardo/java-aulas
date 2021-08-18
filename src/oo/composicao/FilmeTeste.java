package oo.composicao;

public class FilmeTeste {
	public static void main(String[] args) {
		
		Filme americanRust = new Filme("American Rust", 2020);
		americanRust.adicionarAtor("Jorge Ruiz", 32);
		
		Ator juliaRuiz = new Ator();
		americanRust.adicionarAtor(juliaRuiz);
		
//		System.out.println(americanRust);
		
		juliaRuiz.adicionarSalario(10000);
//		System.out.println(juliaRuiz.getSalario());
		
		Ator hillDiamond = new Ator();
		americanRust.adicionarAtor(hillDiamond);
		
//		System.out.println(hillDiamond.getSalario());
		
		americanRust.adicionarAtor("Hillary BIll", 18);
		americanRust.adicionarAtor("Gill Rughal", 32);
		americanRust.adicionarAtor("Andre Milano", 40);
		
		System.out.println(americanRust.removerAtor("jorge ruiz"));
		
		for(Ator ator: americanRust.lista()) {
			System.out.println(ator.nome);
		}
		
	}
}
