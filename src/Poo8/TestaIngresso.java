package Poo8;

public class TestaIngresso {

	public static void main(String[] args) {
		
		Ingresso estudante1 = new Ingresso("Carros","Convencional",3, "com Desconto Estudante",30);
		Ingresso clienteBanco1 = new Ingresso("Vingadores","Especial 3D",2,"com Desconto",50);
		
		estudante1.getvisualisador();
		clienteBanco1.getvisualisador();

	}

}
