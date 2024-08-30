package application;

import java.util.Scanner;
import entities.Desenvolvedor;
import entities.Gerente;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nomeEmpregado;
		double salarioEmpregado;
		
		System.out.println("--------------------------------------------");
		System.out.print("Nome do Gerente: ");
		nomeEmpregado = sc.nextLine();
		System.out.print("Salário do Gerente: ");
		salarioEmpregado = sc.nextDouble();
		System.out.println("--------------------------------------------");
		Gerente gerente = new Gerente(nomeEmpregado, salarioEmpregado);
		
		sc.nextLine(); //consumir o espaço pendente no buffer
		
		System.out.println("--------------------------------------------");
		System.out.print("Nome do Desenvolvedor: ");
		nomeEmpregado = sc.nextLine();
		System.out.print("Salário do Desenvolvedor: ");
		salarioEmpregado = sc.nextDouble();
		System.out.println("--------------------------------------------");
		Desenvolvedor dev = new Desenvolvedor(nomeEmpregado, salarioEmpregado);
		
		System.out.println("--------------------------------------------");
		System.out.println(dev);
		System.out.println(gerente);
		System.out.println("--------------------------------------------");
		
		sc.close();
	}

}
