package Condicionais3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite apenas um número: ");
		numero = leia.nextInt();
		
	if ((numero %2 ==0) && (numero >0)) {
		System.out.println("Número Digitado é Par e Positivo ");
	}else {
		System.out.println("Número Digitado é Impar e Negativo ");

	}

	}
}	
