package entities;

public abstract class Veiculo implements Transportavel {
    protected String marca;
    protected String modelo;
    protected int pesoAtual;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.pesoAtual = 0;
    }

    @Override
    public int pesoAtual() {
        return pesoAtual;
    }

    @Override
    public abstract int cargaMaxima();
}