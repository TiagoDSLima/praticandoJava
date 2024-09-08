package entities;

public abstract class Pagamento implements Recebivel {
    protected String dataPagamento;
    protected double valor;

    public Pagamento(String dataPagamento, double valor) {
        this.dataPagamento = dataPagamento;
        this.valor = valor;
    }

    @Override
    public String consultarRecebimento() {
        return dataPagamento;
    }
}
