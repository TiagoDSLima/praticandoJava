package entitites;

import services.Pagavel;

public class Funcionario implements Pagavel{

	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public void realizarPagamento() {
		System.out.println("Pagamento realizado no valor de R$" + String.format("%.2f", salario) + " para o funcionário " + nome);
	}	
}
