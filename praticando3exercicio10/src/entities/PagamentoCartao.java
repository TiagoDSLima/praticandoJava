package entities;

public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(String dataPagamento, double valor) {
        super(dataPagamento, valor);
    }

    @Override
    public double calcularValorRecebido() {
        return valor * 0.98;
    }

    @Override
    public String toString() {
        return "Pagamento com Cartão - Valor Recebido: R$ " + String.format("%.2f", calcularValorRecebido()) +
               ", Data de Recebimento: " + consultarRecebimento();
    }
}
