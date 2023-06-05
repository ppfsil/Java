package Poo8;

public class Farmacia {

	public String nomeProd;
	public String tipoProd;
	public int qtdProd;
	public int codProd;
	public int precoProd;
	
	
	public Farmacia(String nomeProd, String tipoProd, int qtdProd, int codProd, int precoProd) {
		
		this.nomeProd = nomeProd;
		this.tipoProd = tipoProd;
		this.qtdProd = qtdProd;
		this.codProd = codProd;
		this.precoProd = precoProd;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public String getTipoProd() {
		return tipoProd;
	}
	public void setTipoProd(String tipoProd) {
		this.tipoProd = tipoProd;
	}
	public int getQtdProd() {
		return qtdProd;
	}
	public void setQtdProd(int qtdProd) {
		this.qtdProd = qtdProd;
	}
	public int getCodProd() {
		return codProd;
	}
	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}
	public int getPrecoProd() {
		return precoProd;
	}
	public void setPrecoProd(int precoProd) {
		this.precoProd = precoProd;
	}
	
	public void getvisualisador() {
		
		System.out.println("\nProduto: " + nomeProd);
		System.out.println("\nProduto: " + nomeProd + " Tipo: " + tipoProd);
		System.out.println("\nQuantidade: " + qtdProd);
		System.out.println("\nValor Total : " + precoProd);
	}
}
