package entities;

public class ProdutoPerecivel extends Produto{

	public ProdutoPerecivel(int cod, double preco, String nome) {
		super(cod, preco, nome);
	}
	
	@Override
	public double calcularDesconto() {
		return preco * 0.10;
	}
	
	public String toString() {
		return "Produto perecível:\nNome: " + nome + "\nPreço: R$"+ String.format("%.2f", preco) + "\nCódigo: " + cod +"\nDesconto total: R$" + String.format("%.2f", calcularDesconto());
	}
}
