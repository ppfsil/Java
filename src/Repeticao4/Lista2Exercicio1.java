package Repeticao4;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		
		int idade=0, maior = 0,menor = 0;
        Scanner ler = new Scanner(System.in);

        while (idade >=0) {
        System.out.println("Digite uma idade: ");
            idade = ler.nextInt();

            if(idade <21) { 
                menor++;
            }else if (idade >50) {
                maior++;
            }

        }
         System.out.println("Total de pessoas maiores de 50 anos: " + maior);
         System.out.println("Total de pessoas menores de 21 anos: " + menor);
    }

	}


