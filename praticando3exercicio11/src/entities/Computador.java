package entities;

public class Computador extends Equipamento {

    public Computador(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void realizarManutencao() {
        status = "Manutenção do computador realizada";
    }

    @Override
    public String toString() {
        return "Computador [Marca: " + marca + ", Modelo: " + modelo + ", Status: " + verificarStatus() + "]";
    }
}
