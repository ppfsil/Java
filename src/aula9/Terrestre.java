package aula9;

public class Terrestre {

	
	private int numeroRodas;
	protected float velocidade;
	
	public Terrestre(int numeroRodas, float velocidade) {
		super();
		this.numeroRodas = numeroRodas;
		this.velocidade = velocidade;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
