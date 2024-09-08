package entities;

public abstract class Conta implements Pagavel {
    protected double valor;
    protected String dataVencimento;

    public Conta(double valor, String dataVencimento) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String dataVencimento() {
        return dataVencimento;
    }
}