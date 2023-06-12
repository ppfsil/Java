package Estrutura7;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lista2Exercicio2 {
	
	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;
	 
     while (opcao != 0) {
        exibirMenu();
        opcao = scanner.nextInt();

        switch (opcao) {
            case 0:
                System.out.println("Programa finalizado.");
                break;
            case 1:
                System.out.print("Digite o nome do livro: ");
                String nomeLivro = scanner.next();
                adicionarLivro(pilhaLivros, nomeLivro);
                break;
            case 2:
                listarLivros(pilhaLivros);
                break;
            case 3:
                retirarLivro(pilhaLivros);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
     }
     scanner.close();
	}  

    private static void exibirMenu() {
    System.out.println("===== Menu =====");
    System.out.println("1: Adicionar um novo livro na pilha");
    System.out.println("2: Listar todos os livros da pilha");
    System.out.println("3: Retirar um livro da pilha");
    System.out.println("0: Finalizar o programa");
    System.out.print("Digite a opção desejada: ");
}

    private static void adicionarLivro(Stack<String> pilhaLivros, String nomeLivro) {
    pilhaLivros.push(nomeLivro);
    System.out.println("Livro adicionado na pilha: " + nomeLivro);
}

    private static void listarLivros(Stack<String> pilhaLivros) {
    if (pilhaLivros.isEmpty()) {
        System.out.println("A pilha está vazia.");
    } else {
        System.out.println("Livros na pilha:");
        for (String livro : pilhaLivros) {
            System.out.println(livro);
        }
    }
}

    private static void retirarLivro(Stack<String> pilhaLivros) {
    if (pilhaLivros.isEmpty()) {
        System.out.println("A pilha está vazia. Não há livros para retirar.");
    } else {
        String livroRetirado = pilhaLivros.pop();
        System.out.println("Livro retirado: " + livroRetirado);
    }
}
}

	