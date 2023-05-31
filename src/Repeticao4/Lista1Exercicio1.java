package Repeticao4;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
			Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Número do Intervalo: ");
		numero1 = leia.nextInt();
		System.out.println("\nDigite o Último Número do Intervalo: ");
		numero2 = leia.nextInt();
		
	if (numero1 < numero2) { //se o numero1 for menor que o 2 faça
		System.out.println("No intervalo entre " + numero1 + " e " + numero2 + "\n");
		
		for (int contador = numero1; contador < numero2; contador++) {
			
			if (contador %3==0 && contador %5==0) {
				System.out.println(contador + " é múltiplo de 3 e 5");
					
			}
		}
	}	
			else {
		System.out.println("Intervalo Inválido");		
		}
	}

}
