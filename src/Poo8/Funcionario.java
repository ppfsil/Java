package Poo8;

public class Funcionario {

	public String nome;
	public String email;
	public int cpf;
	public int telefone;
	public int idade;
	
	
	
	
	public Funcionario(String nome, String email, int cpf, int telefone, int idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
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
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void getvisualisador() {
		System.out.print("\nNome: " + nome);
		System.out.print("\nCPF: " + cpf);
		System.out.print("\nE-mail: " + email);
		System.out.print("\nTelefone: " + telefone);
		System.out.println("\nIdade: " + idade + " anos");
		
	}
	
}
