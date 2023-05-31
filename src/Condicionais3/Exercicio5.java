package Condicionais3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 
		int num , quantidade;
		float valor , valorTotal;
		
		System.out.println("Menu");
		System.out.println("\n1 - Cachorro Quente \n2- X-Salada \n3- X-Bacon \n4- Bauru \n5- Refrigerante \n6- Suco de Laranja");
		System.out.println("\nDigite o Código do Item desejado: ");
		num = leia.nextInt();
		
		System.out.println("Digite a Quantidade desejada desse item: ");
		quantidade = leia.nextInt();
		
			switch (num) {
			
			case 1:
				System.out.println("Cachorro Quente");
				valor = 10;
				valorTotal = (valor*quantidade);
				System.out.printf("Valor Total do Pedido: %.2f ", valorTotal);
				break;
				
			case 2:
				System.out.println("X - Salada");
				valor = 15;
				valorTotal = (valor*quantidade);
				System.out.printf("Valor Total do Pedido: %.2f ", valorTotal);
				break;
				
			case 3:
				System.out.println("X - Bacon");
				valor = 18;
				valorTotal = (valor*quantidade);
				System.out.printf("Valor Total do Pedido: %.2f ", valorTotal);
				break;
				
			case 4:
				System.out.println("Bauru");
				valor = 12;
				valorTotal = (valor*quantidade);
				System.out.printf("Valor Total do Pedido: %.2f ", valorTotal);
				break;
				
			case 5:
				System.out.println("Refrigerante");
				valor = 8;
				valorTotal = (valor*quantidade);
				System.out.printf("Valor Total do Pedido: %.2f ", valorTotal);
				break;
				
			case 6:
				System.out.println("Suco de Laranja");
				valor = 13;
				valorTotal = (valor*quantidade);
				System.out.printf("Valor Total do Pedido: %.2f ", valorTotal);
				break;
									
			}
			System.out.println("\n Bom Apetite! ");	
	}

}
