package Condicionais3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int valorA = 2;
		int valorB = 4;
		int valorC = 5;
		int soma;
		
		System.out.println("Digite um Valor A: ");
		valorA = leia.nextInt();
		
		System.out.println("Digite um Valor B: ");
		valorB = leia.nextInt();
							
		soma = (valorA + valorB);
		 
	if (soma > valorC){
		System.out.println("O Valor de A + B é > Valor de C:");	
	}
		
	if (soma < valorC){
		System.out.println("O Valor de A + B é < Valor de C:" + soma);
	}
		
	if (soma == valorC) {
		System.out.println("O Valor de A + B é = Valor de C:" + soma);
	}

	}

}
