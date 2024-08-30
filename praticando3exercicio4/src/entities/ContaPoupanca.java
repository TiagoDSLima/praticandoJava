package entities;

public class ContaPoupanca extends ContaBancaria{
	
	public ContaPoupanca(int nConta) {
		super(nConta);
	}

	public void aplicarJuros() {
		this.saldo += saldo * 1/100; //rendimendo de 1%
	}

}
