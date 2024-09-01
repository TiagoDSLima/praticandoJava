package application;

import java.util.Scanner;
import entities.Livro;
import entities.Revista;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o título e o autor do livro e quantas páginas ele tem? (Respectivamente) ");
		String titulo = sc.nextLine();
		String autor = sc.nextLine();
		int qtd = sc.nextInt();
		Livro livro = new Livro(autor, titulo, qtd);
		
		sc.nextLine(); //consumir quebra de linha
		
		System.out.print("Qual o título, o autor e qual é a edição da revista? (Respectivamente) ");
		titulo = sc.nextLine();
		autor = sc.nextLine();
		qtd = sc.nextInt();
		Revista revista = new Revista(autor, titulo, qtd);
		
		int opc;
		
		do {
			System.out.println("------------------------------------------------");
			System.out.println("		BIBLIOTECA                 ");
			System.out.println("1. Emprestar ");
			System.out.println("2. Devolver ");
			System.out.println("0. Sair");
			System.out.println("------------------------------------------------");
			opc = sc.nextInt();
			
			switch(opc){
				case 1:
					System.out.println("Qual livro ou revista deseja pegar? ");
					System.out.println("1. " + livro);
					System.out.println("2. " + revista);
					System.out.print("Opção (1/2): ");
					int opcEmprestimo = sc.nextInt();
					switch (opcEmprestimo) {
				    case 1:
				        if (livro.consultarDisponibilidade()) {
				            livro.emprestar();
				        } else {
				            System.out.println("Livro indisponível para empréstimo no momento");
				        }
				        break;
				    case 2:
				        if (revista.consultarDisponibilidade()) {
				            revista.emprestar();
				        } else {
				            System.out.println("Revista indisponível para empréstimo no momento");
				        }
				        break;
				    default:
				        System.out.println("Opção inválida!");
					}
					break;
				case 2:
					System.out.println("Qual livro ou revista deseja devolver? ");
					System.out.println("1. " + livro);
					System.out.println("2. " + revista);
					System.out.print("Opção (1/2): ");
					int opcDevolucao = sc.nextInt();
					switch (opcDevolucao) {
				    case 1:
				        if (livro.consultarDisponibilidade()) {
				        	System.out.println("Livro já está na prateleira");
				        } else {
				            livro.devolver();
				        }
				        break;
				    case 2:
				    	if (revista.consultarDisponibilidade()) {
				        	System.out.println("A revista já está na prateleira");
				        } else {
				            revista.devolver();
				        }
				        break;
				    default:
				        System.out.println("Opção inválida!");
					}
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					
			}
		} while(opc != 0);
		
		
		
		
		sc.close();
	}

}
