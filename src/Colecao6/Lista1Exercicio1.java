package Colecao6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.String;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();
		
		String cor;

		for (int numero = 0; numero < 5; numero++) {
			System.out.print("Digite as cores diferentes: ");
			cor = teclado.next(); // vai colococar dentro da lista as cores
			cores.add(cor);

		}
		System.out.println("As cores digitadas foram: ");
		
		for(String color : cores) {
			System.out.println(color);
		}		
		Collections.sort(cores);
		System.out.println("\nAs cores ordenadas são: \n");
		
		for(String color : cores) {
			System.out.println(color);

		}
	}

}
