package application;

import entities.ContaLuz;
import entities.ContaAgua;
import entities.ContaTelefone;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro da Conta de Luz:");
        System.out.print("Valor da Conta de Luz: R$ ");
        double valorLuz = sc.nextDouble();
        sc.nextLine();  
        System.out.print("Data de Vencimento da Conta de Luz (dd/mm/yyyy): ");
        String vencimentoLuz = sc.nextLine();
        ContaLuz contaLuz = new ContaLuz(valorLuz, vencimentoLuz);

        System.out.println("\nCadastro da Conta de Água:");
        System.out.print("Valor da Conta de Água: R$ ");
        double valorAgua = sc.nextDouble();
        sc.nextLine();  
        System.out.print("Data de Vencimento da Conta de Água (dd/mm/yyyy): ");
        String vencimentoAgua = sc.nextLine();
        ContaAgua contaAgua = new ContaAgua(valorAgua, vencimentoAgua);

        System.out.println("\nCadastro da Conta de Telefone:");
        System.out.print("Valor da Conta de Telefone: R$ ");
        double valorTelefone = sc.nextDouble();
        sc.nextLine();  
        System.out.print("Data de Vencimento da Conta de Telefone (dd/mm/yyyy): ");
        String vencimentoTelefone = sc.nextLine();
        ContaTelefone contaTelefone = new ContaTelefone(valorTelefone, vencimentoTelefone);

        System.out.println("\nInformações das Contas:");
        System.out.println(contaLuz);
        System.out.println(contaAgua);
        System.out.println(contaTelefone);

        sc.close();
    }
}