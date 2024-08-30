package entities;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularBonus() {
		return salario * 10/100;
	}
	
	public String toString() {
		return "O desenvolvedor " + nome + " recebe o salário base de R$" + String.format("%.2f", salario) + ", o bônus será de R$" + String.format("%.2f", calcularBonus());
	}
}
