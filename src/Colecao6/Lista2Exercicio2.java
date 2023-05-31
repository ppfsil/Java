package Colecao6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		Scanner mostrar = new Scanner(System.in);
		int digitado;

		Set<Integer> setNumbers = new HashSet<Integer>();

		setNumbers.add(5);
		setNumbers.add(4);
		setNumbers.add(3);
		setNumbers.add(2);
		setNumbers.add(1);
		setNumbers.add(0);
		setNumbers.add(6);
		setNumbers.add(7);
		setNumbers.add(8);
		setNumbers.add(9);

		System.out.println("Digite o Número Desejado: ");
		digitado = mostrar.nextInt();

		if (setNumbers.contains(digitado)) {
			System.out.println("--- Número " + digitado + " Encontrado ---");
		} else {
			System.out.println("\"--- Número " + digitado + " Não Encontrado ---\"");
		}
		mostrar.close();
	}

}
