package entities;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(String dataPagamento, double valor) {
        super(dataPagamento, valor);
    }

    @Override
    public double calcularValorRecebido() {
        return valor * 0.99;
    }

    @Override
    public String toString() {
        return "Pagamento com Boleto - Valor Recebido: R$ " + String.format("%.2f", calcularValorRecebido()) +
               ", Data de Recebimento: " + consultarRecebimento();
    }
}
