package entities;

public abstract class ContaBancaria implements Conta{
	
	protected double saldo;
	protected int nConta; 

	public ContaBancaria(int nConta) {
		this.nConta = nConta;
	}


	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	@Override
	public double consultarSaldo() {
		return saldo;
	}
}
