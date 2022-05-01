package Exercicio_Pousada;

public class Cliente {
	private String nome = new String();
	private String email;
	
	
	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return nome + ", email: " + email;
	}
	
	
}
