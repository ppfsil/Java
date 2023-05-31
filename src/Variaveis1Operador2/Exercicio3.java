package Variaveis1Operador2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
  
		float nota1 , nota2 , nota3 , nota4 , somanota;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.println("Digite a Nota 1: ");
			nota1 = leia.nextFloat();
			
			System.out.println("Digite a Nota 2: ");
			nota2 = leia.nextFloat();

			System.out.println("Digite a Nota 3: ");
			nota3 = leia.nextFloat();
			
			System.out.println("Digite a Nota 4: ");
			nota4 = leia.nextFloat();
			
			somanota = nota1 + nota2 + nota3 + nota4;
			 
			System.out.printf("Sua média é:   %.1f" , somanota/4);
			
	}

}
