package entities;

public class ProdutoNaoPerecivel extends Produto{

	public ProdutoNaoPerecivel(int cod, double preco, String nome) {
		super(cod, preco, nome);
	}

	@Override
	public double calcularDesconto() {
		return preco * 0.05;
	}
	
	public String toString() {
		return "Produto não perecível:\nNome: " + nome + "\nPreço: R$"+ String.format("%.2f", preco) + "\nCódigo: " + cod +"\nDesconto total: R$" + String.format("%.2f", calcularDesconto());
	}
}
