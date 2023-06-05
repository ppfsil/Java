package aula9;

public class Automovel {

	private int capacidade;

	
	public Automovel(int capacidade) {
		super();
		this.capacidade = capacidade;
			
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void getvisualizar() {
		System.out.println("Olá!");
	}
}
