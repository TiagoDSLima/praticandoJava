package application;

import entities.PagamentoCartao;
import entities.PagamentoBoleto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro do Pagamento com Cartão:");
        System.out.print("Valor do Pagamento com Cartão: R$ ");
        double valorCartao = sc.nextDouble();
        sc.nextLine();
        System.out.print("Data do Pagamento com Cartão (dd/mm/yyyy): ");
        String dataCartao = sc.nextLine();
        PagamentoCartao pagamentoCartao = new PagamentoCartao(dataCartao, valorCartao);

        System.out.println("\nCadastro do Pagamento com Boleto:");
        System.out.print("Valor do Pagamento com Boleto: R$ ");
        double valorBoleto = sc.nextDouble();
        sc.nextLine();
        System.out.print("Data do Pagamento com Boleto (dd/mm/yyyy): ");
        String dataBoleto = sc.nextLine();
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto(dataBoleto, valorBoleto);

        System.out.println("\nInformações dos Pagamentos:");
        System.out.println(pagamentoCartao);
        System.out.println(pagamentoBoleto);

        sc.close();
    }
}
