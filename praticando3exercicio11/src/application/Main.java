package application;

import entities.Computador;
import entities.Impressora;
import entities.Roteador;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro do Computador:");
        System.out.print("Marca do Computador: ");
        String marcaComputador = sc.nextLine();
        System.out.print("Modelo do Computador: ");
        String modeloComputador = sc.nextLine();
        Computador computador = new Computador(marcaComputador, modeloComputador);

        System.out.println("\nCadastro da Impressora:");
        System.out.print("Marca da Impressora: ");
        String marcaImpressora = sc.nextLine();
        System.out.print("Modelo da Impressora: ");
        String modeloImpressora = sc.nextLine();
        Impressora impressora = new Impressora(marcaImpressora, modeloImpressora);

        System.out.println("\nCadastro do Roteador:");
        System.out.print("Marca do Roteador: ");
        String marcaRoteador = sc.nextLine();
        System.out.print("Modelo do Roteador: ");
        String modeloRoteador = sc.nextLine();
        Roteador roteador = new Roteador(marcaRoteador, modeloRoteador);

        computador.realizarManutencao();
        impressora.realizarManutencao();
        roteador.realizarManutencao();

        System.out.println("\nStatus dos Equipamentos:");
        System.out.println(computador);
        System.out.println(impressora);
        System.out.println(roteador);

        sc.close();
    }
}