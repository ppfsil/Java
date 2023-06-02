package Poo8;

public class Cliente {

	public String nome;
	public String email;
	public int cpf;
	public int idade;
	public int telefone;
	
		
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
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Cliente(String nome, String email, int cpf, int idade, int telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	public void getvisualisador() {
		System.out.println("\nNome: " + nome);
		System.out.println("\nCPF: " + cpf);
		System.out.println("\nE-mail: " + email);
		System.out.println("\nTelefone: " + telefone);
	}
}







