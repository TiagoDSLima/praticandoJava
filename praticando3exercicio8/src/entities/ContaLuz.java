package entities;

public class ContaLuz extends Conta {

    public ContaLuz(double valor, String dataVencimento) {
        super(valor, dataVencimento);
    }

    @Override
    public double valorPagar() {
        return valor * 1.15;
    }

    @Override
    public String toString() {
        return "Conta de Luz - Valor a Pagar: R$ " + String.format("%.2f", valorPagar()) + 
               ", Data de Vencimento: " + dataVencimento();
    }
}