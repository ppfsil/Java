package Poo8;

public class Curso {

	public String nomeCurso;
	public String tipoCurso;
	public int salaCurso;
	public int duracaoCurso;
	public float precoCurso;
	
	
	public Curso(String nomeCurso, String tipoCurso, int salaCurso, int duracaoCurso, float precoCurso) {
		
		this.nomeCurso = nomeCurso;
		this.tipoCurso = tipoCurso;
		this.salaCurso = salaCurso;
		this.duracaoCurso = duracaoCurso;
		this.precoCurso = precoCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getTipoCurso() {
		return tipoCurso;
	}
	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
	public int getSalaCurso() {
		return salaCurso;
	}
	public void setSalaCurso(int salaCurso) {
		this.salaCurso = salaCurso;
	}
	public int getDuracaoCurso() {
		return duracaoCurso;
	}
	public void setDuracaoCurso(int duracaoCurso) {
		this.duracaoCurso = duracaoCurso;
	}
	public float getPrecoCurso() {
		return precoCurso;
	}
	public void setPrecoCurso(float precoCurso) {
		this.precoCurso = precoCurso;
	}
	
	public void getvisualisador() {
			
		System.out.print("\nCurso: " + nomeCurso);
		System.out.print("\n" + tipoCurso + " sala: " + salaCurso);
		System.out.print("\nDuração: " + duracaoCurso + " meses");
		System.out.println("\nValor Final do Contrato : " + precoCurso);
		
		if(duracaoCurso >= 12)
			System.out.println("---Você ganhou um Curso Livre Grátis--- ");
else if(duracaoCurso < 6)
		System.out.println("---Você ganhou um Voucher para uma Palestra--- ");
else
	System.out.println("---Acesse nosso Site para adquirir Descontos como Aluna---");
	}
}
