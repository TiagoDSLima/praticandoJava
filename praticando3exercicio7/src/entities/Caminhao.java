package entities;

public class Caminhao extends Veiculo {
    private int cargaMaxima;

    public Caminhao(String marca, String modelo, int cargaMaxima) {
        super(marca, modelo);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public int cargaMaxima() {
        return cargaMaxima;
    }

    public void carregarCarga(int peso) {
        if (pesoAtual + peso <= cargaMaxima) {
            pesoAtual += peso;
        } else {
            System.out.println("Carga excede o limite máximo do caminhão.");
        }
    }

    @Override
    public String toString() {
        return "Caminhão - Marca: " + marca + ", Modelo: " + modelo + 
               ", Peso Atual: " + pesoAtual + " kg, Carga Máxima: " + cargaMaxima + " kg";
    }
}
