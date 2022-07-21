package entidades;

import java.util.ArrayList;

public class Usuario{

	private String nome;
	private String email;
	private String cpf;
	
	ArrayList<Pruur> pruurs;
	
	public Usuario() {
		super();
	}

	public Usuario(String nome, String email, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public ArrayList<Pruur> getPruur() {
		return pruurs;
	}

	public void setPruur(ArrayList<Pruur> pruur) {
		this.pruurs = pruur;
	}

	@Override
	public String toString() {
		return nome + " - " + email;
	}

}
