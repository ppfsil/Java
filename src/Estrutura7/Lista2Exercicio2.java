package Estrutura7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		Scanner menu = new Scanner(System.in);
		Queue<String> pilha1 = new LinkedList<>();
		String livro;
		
		while (true) {
			System.out.print("*************Menu**********************\n\n");
			System.out.print(" Opção 1 - Adicionar Livro na Pilha      \n");
			System.out.print(" Opção 2 - Listar todos os Livros        \n");
			System.out.print(" Opção 3 - Mostrar Livro da Pilha        \n");
			System.out.print(" Opção 0 - Sair                        \n\n");
			System.out.print("***************************************\n\n");
			System.out.print("Entre com a opção Desejada:              \n");
				
		int opcao = menu.nextInt();
		
		if (opcao == 0) {
			System.out.println("Saindo do Sistema");
			menu.close();
			System.exit(0); //faz parar o sistema
			
		switch (opcao) {
		case 1:
			System.out.print("\nOpção [1] Adicionar Livro na Pilha \n");
			livro = menu.next();
			pilha1.offer(livro);
			System.out.print("\nFila: \n" + livro + "\n Cliente adicionado \n");
			break;   //faz parar o loop
		case 2:
			System.out.print("\nOpção [2] Listar todos os Livros \n");
			break;
		case 3:
			System.out.print("\nOpção [3] Mostrar Livro da Pilha \n");
			break;
		}
		
		
		}
	}

	}
}