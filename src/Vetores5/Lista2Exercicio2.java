package Vetores5;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int somaSecundaria = 0;
		int somaPrincipal = 0;

		for (int l = 0; l < 3; l++) { // linhas
			for (int c = 0; c < 3; c++) { // colunas
				System.out.println("Insira os Valores da Linha " + l + " e os Valores da Coluna " + c); // obter os
																										// dados do
																										// usuário
				matriz[l][c] = entrada.nextInt(); // pede os dados
			}
		}
		// exibir diagonal principal
		System.out.println("Elementos da Diagonal Principal: ");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (l == c) {
					System.out.println(matriz[l][c] + " ");
					somaPrincipal = somaPrincipal + matriz[l][c];
				}
			}
		}
		System.out.println("Elementos da Diagonal Secundária: ");
		for (int l = 0; l < 3; l++) {
			for (int c = 2; c >= 0; c--) {
				System.out.println(matriz[l][c] + " ");
				somaSecundaria = somaSecundaria + matriz[l][c];
				l++;
			}
		}
		System.out.println("Soma dos Elementos na Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos Elementos na Diagonal Secundaria: " + somaSecundaria);
	}
}
