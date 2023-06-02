package Poo8;

public class Produto {

	public String nomeJogo;
	public String marcaJogo;
	public int qtdProd;
	public int codJogo;
	public int estoqueG;
	
	
	public Produto(String nomeJogo, String marcaJogo, int qtdProd, int codJogo, int estoqueG) {
		super();
		this.nomeJogo = nomeJogo;
		this.marcaJogo = marcaJogo;
		this.qtdProd = qtdProd;
		this.codJogo = codJogo;
		this.estoqueG = estoqueG;
	}
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public String getMarcaJogo() {
		return marcaJogo;
	}
	public void setMarcaJogo(String marcaJogo) {
		this.marcaJogo = marcaJogo;
	}
	public int getQtdProd() {
		return qtdProd;
	}
	public void setQtdProd(int qtdProd) {
		this.qtdProd = qtdProd;
	}
	public int getCodJogo() {
		return codJogo;
	}
	public void setCodJogo(int codJogo) {
		this.codJogo = codJogo;
	}
	public int getEstoque() {
		return estoqueG;
	}
	public void setEstoque(int estoque) {
		this.estoqueG = estoque;
	}
	
	public void getvisualisador() {
		System.out.println("\nNome do Jogo: " + nomeJogo);
		System.out.println("\nMarca do Jogo: " + marcaJogo);
		System.out.println("\nQuantidade por Produto: " + qtdProd);
		System.out.println("\nTemos no Estoque Geral : " + estoqueG);
	}
}
