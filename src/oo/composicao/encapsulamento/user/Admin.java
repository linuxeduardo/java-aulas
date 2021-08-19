package oo.composicao.encapsulamento.user;

public class Admin extends Usuario {
	Usuario u = new Usuario();
	
	public void show() {
		System.out.println(u.loggedIn);
		
	}
}
