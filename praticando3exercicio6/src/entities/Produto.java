package entities;

public abstract class Produto {
	
	protected int cod;
	protected double preco;
	protected String nome;
	
	public Produto(int cod, double preco, String nome) {
		this.cod = cod;
		this.preco = preco;
		this.nome = nome;
	}

	public double calcularDesconto() {
		return 0;
	}
}
