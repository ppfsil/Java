package Condicionais3;

import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		float salarioBase , salarioLiquido , reajuste;
		int cargo;
		String colaborador;
		
		System.out.println("Quadro de Colaboradores: ");
		System.out.println("\n1 - Gerente \n2 - Vendedor \n3 - Supervisor \n4 - Motorista \n5 - Estoquista \n6 - Tecnico de TI");
		System.out.println("Digite o Nome do Colaborador: ");
		colaborador = leia.nextLine();
		System.out.println("Digite o Código do Cargo: ");
		cargo = leia.nextInt();
	
		
		switch (cargo) {
			
		case 1:
			System.out.printf("Nome do Colaborador:" + colaborador + "\nCargo: Gerente");
			System.out.printf("\nDigite o Salário: ");
			salarioBase = leia.nextFloat();
			reajuste = 0.1f;
			salarioLiquido = (salarioBase +(salarioBase*reajuste));
			System.out.printf("Salário Reajustado: %.2f" , salarioLiquido);
			break;
			
		case 2:
			System.out.printf("Nome do Colaborador:" + colaborador + "\nCargo: Vendedor");
			System.out.printf("\nDigite o Salário: ");
			salarioBase = leia.nextFloat();
			reajuste = 0.07f;
			salarioLiquido = (salarioBase +(salarioBase*reajuste));
			System.out.printf("Salário Reajustado: %.2f" , salarioLiquido);
			break;
			
		case 3:
			System.out.printf("Nome do Colaborador:" + colaborador + "\nCargo: Supervisor");
			System.out.printf("\nDigite o Salário: ");
			salarioBase = leia.nextFloat();
			reajuste = 0.09f;
			salarioLiquido = (salarioBase +(salarioBase*reajuste));
			System.out.printf("Salário Reajustado: %.2f" , salarioLiquido);
			break;
			
		case 4:
			System.out.printf("Nome do Colaborador:" + colaborador + "\nCargo: Motorista");
			System.out.printf("\nDigite o Salário: ");
			salarioBase = leia.nextFloat();
			reajuste = 0.06f;
			salarioLiquido = (salarioBase +(salarioBase*reajuste));
			System.out.printf("Salário Reajustado: %.2f" , salarioLiquido);
			break;
			
		case 5:
			System.out.printf("Nome do Colaborador:" + colaborador + "\nCargo: Estoquista");
			System.out.printf("\nDigite o Salário: ");
			salarioBase = leia.nextFloat();
			reajuste = 0.05f;
			salarioLiquido = (salarioBase +(salarioBase*reajuste));
			System.out.printf("Salário Reajustado: %.2f" , salarioLiquido);
			break;
			
		case 6:
			System.out.printf("Nome do Colaborador:" + colaborador + "\nCargo: Tecnico de T.I");
			System.out.printf("\nDigite o Salário: ");
			salarioBase = leia.nextFloat();
			reajuste = 0.08f;
			salarioLiquido = (salarioBase +(salarioBase*reajuste));
			System.out.printf("Salário Reajustado: %.2f" , salarioLiquido);
			break;	
	}

}

}