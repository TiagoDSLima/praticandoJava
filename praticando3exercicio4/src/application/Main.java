package application;

import entities.ContaCorrente;
import entities.ContaPoupanca;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Criar conta corrente, digite o ID da conta: ");
		int idCorrente = sc.nextInt();
		ContaCorrente contaCorrente = new ContaCorrente(idCorrente);
		
		System.out.print("Criar conta poupança, digite o ID da conta: ");
		int idPoupanca = sc.nextInt();
		ContaPoupanca contaPoupanca = new ContaPoupanca(idPoupanca);
		
		int opc = 0;
		
		do {
			System.out.println("\n-----------------------------MENU-----------------------------");
			System.out.println("     1. Sacar");
			System.out.println("     2. Depositar");
			System.out.println("     3. Consultar Saldo");
			System.out.println("     0. Sair...");
			System.out.println("-----------------------------MENU-----------------------------\n");
			opc = sc.nextInt();
			System.out.print("Irá fazer operação em qual conta? (C/P)");
			char tipoConta = sc.next().charAt(0);
			if(tipoConta != 'C' && tipoConta != 'P') {
				System.out.println("Valor inválido!");
				opc = 4; //gambiarra total
			}
			switch(opc) {
			
				case 1:
					System.out.print("Qual o valor de saque?");
					double valor = sc.nextDouble();
					if(tipoConta == 'C') {
						contaCorrente.sacar(valor);
					} else {
						contaPoupanca.sacar(valor);
					}
					break;
				case 2:
					System.out.print("Qual o valor de deposito?");
					double valorDeposito = sc.nextDouble();
					if(tipoConta == 'C') {
						contaCorrente.depositar(valorDeposito);
					} else {
						contaPoupanca.depositar(valorDeposito);
					}
					break;
				case 3:
					if(tipoConta == 'C') {
						System.out.println("Saldo: R$" + String.format("%.2f", contaCorrente.consultarSaldo()));
					} else {
						System.out.println("Saldo: R$" + String.format("%.2f", contaPoupanca.consultarSaldo()));
					}
					break;
				case 4:
					break;
				default:
					System.out.println("Valor inválido!");
					
			}
			
		}while(opc != 0);
		
		
		sc.close();
	}

}
