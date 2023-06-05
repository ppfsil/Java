package Poo8;

public class Ingresso {

	public String nomeFilme;
	public String tipoSala;
	public int salaFilme;
	public String tipoPagamento;
	public float precoFinal;
	
	
	public Ingresso(String nomeFilme, String tipoSala, int salaFilme, String tipoPagamento, float precoFinal) {
		super();
		this.nomeFilme = nomeFilme;
		this.tipoSala = tipoSala;
		this.salaFilme = salaFilme;
		this.tipoPagamento = tipoPagamento;
		this.precoFinal = precoFinal;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public String getTipoSala() {
		return tipoSala;
	}
	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}
	public int getSalaFilme() {
		return salaFilme;
	}
	public void setSalaFilme(int salaFilme) {
		this.salaFilme = salaFilme;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public float getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}
		public void getvisualisador(){
			
			System.out.println("\nFilme Escolhido: " + nomeFilme);
			System.out.println("\nFilme Escolhido: " + nomeFilme + " na sala: " + tipoSala + " número: " + salaFilme);
			System.out.println("\nPagamento Efetuado: " + tipoPagamento);
			System.out.println("\nValor Final do Ticket : " + precoFinal);
		}
	
}
