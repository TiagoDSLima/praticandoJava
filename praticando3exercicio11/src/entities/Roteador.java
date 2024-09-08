package entities;

public class Roteador extends Equipamento {

    public Roteador(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void realizarManutencao() {
        status = "Manutenção do roteador realizada";
    }

    @Override
    public String toString() {
        return "Roteador [Marca: " + marca + ", Modelo: " + modelo + ", Status: " + verificarStatus() + "]";
    }
}