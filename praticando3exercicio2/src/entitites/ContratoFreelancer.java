package entitites;

import services.Pagavel;

public class ContratoFreelancer implements Pagavel{
	
	private String nome;
	private double valorContrato;
	
	public ContratoFreelancer(String nome, double valorContrato) {
		this.nome = nome;
		this.valorContrato = valorContrato;
	}


	@Override
	public void realizarPagamento() {
		System.out.println("Pagamento realizado no valor de R$" + String.format("%.2f", valorContrato) + " para o freelancer " + nome);
	}
	
}
