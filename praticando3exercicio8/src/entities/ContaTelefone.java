package entities;

public class ContaTelefone extends Conta {

    public ContaTelefone(double valor, String dataVencimento) {
        super(valor, dataVencimento);
    }

    @Override
    public double valorPagar() {
        return valor;
    }

    @Override
    public String toString() {
        return "Conta de Telefone - Valor a Pagar: R$ " + String.format("%.2f", valorPagar()) + 
               ", Data de Vencimento: " + dataVencimento();
    }
}