package entities;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(int nConta) {
		super(nConta);
	}

	public void cobrarTaxaMensal() {
		this.saldo -= 10; //taxa mensal aleatória
	}

	

}
