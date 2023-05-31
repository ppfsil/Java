package Variaveis1Operador2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		float numero1, numero2, numero3, numero4, diferenca;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o Primeiro Número: ");
		numero1 = leia.nextFloat();

		System.out.println("Digite o Segundo Número: ");
		numero2 = leia.nextFloat();

		System.out.println("Digite o Terceiro Número: ");
		numero3 = leia.nextFloat();

		System.out.println("Digite o Quarto Número: ");
		numero4 = leia.nextFloat();

		diferenca = ((numero1 * numero2) - (numero3 * numero4));
		System.out.println("A Diferença é: " + diferenca);
	}

}
