package entities;

public class Impressora extends Equipamento {

    public Impressora(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void realizarManutencao() {
        status = "Manutenção da impressora realizada";
    }

    @Override
    public String toString() {
        return "Impressora [Marca: " + marca + ", Modelo: " + modelo + ", Status: " + verificarStatus() + "]";
    }
}