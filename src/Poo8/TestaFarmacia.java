package Poo8;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Farmacia medPressao1 = new Farmacia("Loratadina", "Medicamento", 2, 001,20);
		Farmacia medDiabetis = new Farmacia("Glifage","Medicamento",5,005, 10);
		
		medPressao1.getvisualisador();
		medDiabetis.getvisualisador();
		
	}

}
