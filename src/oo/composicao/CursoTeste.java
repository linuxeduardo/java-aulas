package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		// N : M

		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Luiz");

		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("Web 2020");
		Curso c3 = new Curso("React");

		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);

		c2.adicionarAluno(a1);
		c2.adicionarAluno(a3);

		a1.adicionarCurso(c3);
		a2.adicionarCurso(c3);
		a3.adicionarCurso(c3);
		
		for(Aluno aluno: c2.alunos) {
			System.out.println("Estou no curso " + c2.nome);
			System.out.println("Meu nome: " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(a1.cursos.get(0).alunos);
		// get student, get first course, get students from 1st course
		System.out.println();
		
		Curso cf = a1.obterCursoPorNome("java");
		if(cf != null) {
			System.out.println(cf.nome);
			System.out.println(cf.alunos);
		}
	}
}
