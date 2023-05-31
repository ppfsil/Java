package Vetores5;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		int numProcurado, naoEncontrado = 11, valores[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		Scanner mostrar = new Scanner(System.in); // ler dados do usuário

		System.out.println("Insira um número: ");
		numProcurado = mostrar.nextInt();

		for (int i = 0; i <= 9; i++) { // compara o q digitou c o q numero esta no vetor
			// valores[i] = (i + 1);
			if (numProcurado == valores[i]) { // estamos comparando se o n digitado esta na posicao do vetor dos n
												// declarados
				System.out.println("Numero " + numProcurado + " procurado está na Posição " + i + " do Vetor");
				naoEncontrado = i; // atualiza valor variavel nao encontrada
			}
		}
		if (naoEncontrado == 11) {
			System.out.println("Número inserido Não encontrado! ");
		}

	}

	// for (int i = 0; i < valores.length; i++) { //estou pedindo para percorrer os
	// valores do vetor e exibir
	// System.out.println(valores[i]);

}