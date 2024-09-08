package entities;

public class ContaAgua extends Conta {

    public ContaAgua(double valor, String dataVencimento) {
        super(valor, dataVencimento);
    }

    @Override
    public double valorPagar() {
        return valor * 1.10;
    }

    @Override
    public String toString() {
        return "Conta de Água - Valor a Pagar: R$ " + String.format("%.2f", valorPagar()) + 
               ", Data de Vencimento: " + dataVencimento();
    }
}