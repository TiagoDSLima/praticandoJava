package application;

import entities.QuartoSimples;
import entities.QuartoLuxo;
import entities.SuitePresidencial;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro do Quarto Simples:");
        System.out.print("Número do Quarto Simples: ");
        int numeroSimples = sc.nextInt();
        QuartoSimples quartoSimples = new QuartoSimples(numeroSimples);

        System.out.println("\nCadastro do Quarto Luxo:");
        System.out.print("Número do Quarto Luxo: ");
        int numeroLuxo = sc.nextInt();
        QuartoLuxo quartoLuxo = new QuartoLuxo(numeroLuxo);

        System.out.println("\nCadastro da Suite Presidencial:");
        System.out.print("Número da Suite Presidencial: ");
        int numeroSuite = sc.nextInt();
        SuitePresidencial suitePresidencial = new SuitePresidencial(numeroSuite);

        System.out.println("\nTentando reservar os quartos:");
        quartoSimples.reservar();
        quartoLuxo.reservar();
        suitePresidencial.reservar();

        System.out.println("\nTentando reservar novamente os quartos:");
        quartoSimples.reservar();
        quartoLuxo.reservar();
        suitePresidencial.reservar();

        System.out.println("\nCancelando reservas dos quartos:");
        quartoSimples.cancelarReserva();
        quartoLuxo.cancelarReserva();
        suitePresidencial.cancelarReserva();

        System.out.println("\nTentando cancelar reservas novamente:");
        quartoSimples.cancelarReserva();
        quartoLuxo.cancelarReserva();
        suitePresidencial.cancelarReserva();

        System.out.println("\nStatus final dos quartos:");
        System.out.println(quartoSimples);
        System.out.println(quartoLuxo);
        System.out.println(suitePresidencial);

        sc.close();
    }
}
