package entities;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double calcularBonus() {
		return salario * 20/100;
	}
	
	public String toString() {
		return "O gerente " + nome + " recebe o salário base de R$" + String.format("%.2f", salario) + ", o bônus será de R$" + String.format("%.2f", calcularBonus());
	}
}
