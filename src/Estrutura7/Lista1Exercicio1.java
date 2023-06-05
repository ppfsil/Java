package Estrutura7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		Scanner mostrar = new Scanner(System.in);
		int opcao;
		Queue<String> fila = new LinkedList<>();

		while (true) {
			System.out.print("*****************Menu***************** \n\n");
			System.out.print(" Opção 1 - Adicionar Cliente na Fila     \n");
			System.out.print(" Opção 2 - Listar todos os Clientes      \n");
			System.out.print(" Opção 3 - Retirar Cliente da Fila       \n");
			System.out.print(" Opção 0 - Sair                        \n\n");
			System.out.print("************************************** \n\n");
			System.out.print("Entre com a opção Desejada: ");
			opcao = mostrar.nextInt();
			
			if (opcao == 0) {
				System.out.print("\nSair");
				mostrar.close();
			}

			String nome;
			opcao = 1;

			switch (opcao) {
			case 1:
				System.out.print("\nOpção [1] Adicionar Cliente na Fila \n");
				nome = mostrar.next();
				fila.offer(nome);
				System.out.print("\nFila: \n" + nome + "\n Cliente adicionado \n");
				break;
			case 2:
				System.out.print("\nOpção [2] Todos os Clientes da Fila\n" + fila + "\n");
				break;
			case 3:
				System.out.print("\nOpção [3] O Cliente:" + fila.remove() + " foi Chamado\n");
				System.out.print("\nLista Atualizada dos Clientes na Fila\n" + fila);
				break;
			case 0:
				System.out.print("\nOpção [0]Programa Finalizado\n");
				break;
		}

		}

	}
}
