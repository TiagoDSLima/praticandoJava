package entities;

public class Carro extends Veiculo {
    private int cargaMaxima;

    public Carro(String marca, String modelo, int cargaMaxima) {
        super(marca, modelo);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public int cargaMaxima() {
        return cargaMaxima;
    }

    public void adicionarBagagem(int peso) {
        if (pesoAtual + peso <= cargaMaxima) {
            pesoAtual += peso;
        } else {
            System.out.println("Bagagem excede o limite máximo do carro.");
        }
    }

    @Override
    public String toString() {
        return "Carro - Marca: " + marca + ", Modelo: " + modelo + 
               ", Peso Atual: " + pesoAtual + " kg, Carga Máxima: " + cargaMaxima + " kg";
    }
}