package application;

import java.util.Scanner;
import entitites.ContratoFreelancer;
import entitites.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		double salarioOuContrato;
		
		System.out.println("-----------------------------");
		System.out.print("Nome do funcionário: ");
		nome = sc.nextLine();
		System.out.print("Salario do funcionário: ");
		salarioOuContrato = sc.nextDouble();
		System.out.println("-----------------------------");
		Funcionario funcionario = new Funcionario(nome, salarioOuContrato);
		
		sc.nextLine(); //consumir espaço pendente no buffer
		
		System.out.println("-----------------------------");
		System.out.print("Nome do Freelancer: ");
		nome = sc.nextLine();
		System.out.print("Valor de Contrato: ");
		salarioOuContrato = sc.nextDouble();
		System.out.println("-----------------------------");
		ContratoFreelancer freela = new ContratoFreelancer(nome, salarioOuContrato);
		
		System.out.println("-----------------------------");
		freela.realizarPagamento();
		funcionario.realizarPagamento();
		System.out.println("-----------------------------");
		
		sc.close();
	}

}
