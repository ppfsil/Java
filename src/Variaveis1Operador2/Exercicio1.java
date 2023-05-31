package Variaveis1Operador2;

import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
				
			
			String nome = "";
			float distancia = 0.0f;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o seu nome: ");
			nome = leia.next();
			
			System.out.println("Digite a distancia ");
			distancia = leia.nextFloat();
			
			System.out.println("Parabens " + nome + ","
					+ " a sua distância percorrida foi de " + distancia);

	}

}
