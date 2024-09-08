package entities;

public class Van extends Veiculo {
    private int cargaMaxima;

    public Van(String marca, String modelo, int cargaMaxima) {
        super(marca, modelo);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public int cargaMaxima() {
        return cargaMaxima;
    }

    public void adicionarPassageiro(int peso) {
        if (pesoAtual + peso <= cargaMaxima) {
            pesoAtual += peso;
        } else {
            System.out.println("Passageiros excedem o limite máximo da van.");
        }
    }

    @Override
    public String toString() {
        return "Van - Marca: " + marca + ", Modelo: " + modelo + 
               ", Peso Atual: " + pesoAtual + " kg, Carga Máxima: " + cargaMaxima + " kg";
    }
}
