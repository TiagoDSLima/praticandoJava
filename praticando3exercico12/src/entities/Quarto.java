package entities;

public abstract class Quarto implements Reservavel {
    protected int numero;
    protected String tipo;
    protected boolean reservado;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.reservado = false;
    }

    @Override
    public void reservar() {
        if (reservado) {
            System.out.println("Quarto " + numero + " já está reservado.");
        } else {
            reservado = true;
            System.out.println("Reserva do quarto " + numero + " efetuada com sucesso.");
        }
    }

    @Override
    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva do quarto " + numero + " cancelada com sucesso.");
        } else {
            System.out.println("Quarto " + numero + " não está reservado.");
        }
    }

    @Override
    public String toString() {
        return tipo + " - Número: " + numero + ", Status: " + (reservado ? "Reservado" : "Disponível");
    }
}
