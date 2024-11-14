package entities;

public class OrderItem {
	
	private int qtd;
	private double price;
	
	private Product product;

	public OrderItem(int qtd, double price, Product product) {
		this.qtd = qtd;
		this.price = price;
		this.product = product;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return price * qtd;
	}

	@Override
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ qtd + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
	
}
