package application;

import java.util.Scanner;
import entities.ProdutoNaoPerecivel;
import entities.ProdutoPerecivel;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do produto perecível: ");
		String nome = sc.nextLine();
		System.out.print("Digite o código do produto perecível: ");
		int cod = sc.nextInt();
		System.out.print("Digite o valor do produto perecível: ");
		double preco = sc.nextDouble();
		ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(cod, preco, nome);
		
		sc.nextLine();
		
		System.out.print("Digite o nome do produto não perecível: ");
		nome = sc.nextLine();
		System.out.print("Digite o código do produto não perecível: ");
		cod = sc.nextInt();
		System.out.print("Digite o valor do produto não perecível: ");
		preco = sc.nextDouble();
		ProdutoNaoPerecivel produtoNaoPerecivel = new ProdutoNaoPerecivel(cod, preco, nome);
		
		System.out.println(produtoNaoPerecivel);
		System.out.println(produtoPerecivel);

		sc.close();
	}

}
