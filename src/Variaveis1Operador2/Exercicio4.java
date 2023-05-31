package Variaveis1Operador2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		float salariobruto , adicionalnoturno , horaextra , descontos , salarioliquido;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o salário Bruto: ");
		salariobruto = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		adicionalnoturno = leia.nextFloat();
		
		System.out.println("Digite a Hora Extra: ");
		horaextra = leia.nextFloat();
		
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		salarioliquido = (salariobruto + adicionalnoturno + (horaextra * 5))- descontos;
		System.out.printf("Salário Liquido: %.2f" , salarioliquido);

	}

}
