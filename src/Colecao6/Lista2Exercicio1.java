package Colecao6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		Scanner mostrar = new Scanner(System.in);

		Set<Integer> setNumbers = new HashSet<Integer>(); // ele que reserva a lista - espaço de memoria para armazenar
															// a lista

		Integer number = Integer.valueOf(10);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			number = mostrar.nextInt();
			setNumbers.add(number);
		}

		System.out.println("Listar Dados do Set: ");
		Iterator<Integer> isetNumbers = setNumbers.iterator();
		while (isetNumbers.hasNext()) {
			System.out.println(isetNumbers.next());
		}
		mostrar.close();

	}

}
