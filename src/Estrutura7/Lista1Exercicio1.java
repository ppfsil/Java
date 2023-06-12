package Estrutura7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Lista1Exercicio1 {

	public static void main(String[] args) {
		Queue<String> filaClientes = new LinkedList<>();
		Scanner mostrar = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0) {
			exibirMenu();
			opcao = mostrar.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			case 1:
				System.out.print("Digite o nome do Cliente: ");
				String nomeCliente = mostrar.next();
				adicionarCliente(filaClientes, nomeCliente);
				break;
			case 2:
				listarCliente(filaClientes);
				break;
			case 3:
				chamarCliente(filaClientes);
				break;
			default:
				System.out.println("Opção Inválida! Tente novamente.");
				break;
			}

		}
		mostrar.close();
	}

	private static void exibirMenu() {
		System.out.println("====== MENU ======");
		System.out.println("1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Clientes da Fila");
		System.out.println("0 - Sair\n");
		System.out.println("Digite a opção desejada: ");
	}

	private static void adicionarCliente(Queue<String> FilaClientes, String nomeCliente) {
		FilaClientes.add(nomeCliente);
		System.out.println("Cliente adicionado na Fila:" + nomeCliente);
	}

	private static void listarCliente(Queue<String> filaClientes) {
	    if (filaClientes.isEmpty()) {
	        System.out.println("A fila está vazia.");
	    } else {
	        System.out.println("Clientes na fila:");
	        for (String Cliente : filaClientes) {
	            System.out.println(Cliente);
	        }
	    }
	}

	private static void chamarCliente(Queue<String> filaClientes) {
		if (filaClientes.isEmpty()) {
			System.out.println("A fila está vazia. Não há clientes para chamar\n");
		} else {
			String clienteChamado = filaClientes.poll();
			System.out.println("Cliente chamado " + clienteChamado);

		}
	}
}
