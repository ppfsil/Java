package Repeticao4;

import java.util.Scanner;

public class Lista3Exercicio1 {

	public static void main(String[] args) {
		int valor = 0;
		int somar = 0;
		
		Scanner leia = new Scanner(System.in);	
		
		do {
			
			System.out.println("Digite um número: ");
			valor = leia.nextInt();
			
				if(valor > 0 ) {
					somar = somar + valor;
				}
		}while (valor != 0);
			System.out.println("\n A soma dos Números é: " + somar);
			
	}

}
