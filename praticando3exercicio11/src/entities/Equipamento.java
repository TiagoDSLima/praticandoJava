package entities;

public abstract class Equipamento implements Manutencao {
    protected String marca;
    protected String modelo;
    protected String status;

    public Equipamento(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.status = "Em funcionamento";
    }

    @Override
    public String verificarStatus() {
        return status;
    }
}
