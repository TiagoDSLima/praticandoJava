package application;

import java.util.Scanner;
import entities.Caminhao;
import entities.Van;
import entities.Carro;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de Caminhão:");
        System.out.print("Marca do Caminhão: ");
        String marcaCaminhao = sc.nextLine();
        System.out.print("Modelo do Caminhão: ");
        String modeloCaminhao = sc.nextLine();
        System.out.print("Carga máxima do Caminhão (kg): ");
        int cargaMaximaCaminhao = sc.nextInt();
        Caminhao caminhao = new Caminhao(marcaCaminhao, modeloCaminhao, cargaMaximaCaminhao);

        System.out.print("Peso a carregar no Caminhão (kg): ");
        int pesoCaminhao = sc.nextInt();
        caminhao.carregarCarga(pesoCaminhao);

        sc.nextLine(); 
 
        System.out.println("\nCadastro de Van:");
        System.out.print("Marca da Van: ");
        String marcaVan = sc.nextLine();
        System.out.print("Modelo da Van: ");
        String modeloVan = sc.nextLine();
        System.out.print("Carga máxima da Van (kg): ");
        int cargaMaximaVan = sc.nextInt();
        Van van = new Van(marcaVan, modeloVan, cargaMaximaVan);

        System.out.print("Peso dos passageiros na Van (kg): ");
        int pesoVan = sc.nextInt();
        van.adicionarPassageiro(pesoVan);

        sc.nextLine(); 


        System.out.println("\nCadastro de Carro:");
        System.out.print("Marca do Carro: ");
        String marcaCarro = sc.nextLine();
        System.out.print("Modelo do Carro: ");
        String modeloCarro = sc.nextLine();
        System.out.print("Carga máxima do Carro (kg): ");
        int cargaMaximaCarro = sc.nextInt();
        Carro carro = new Carro(marcaCarro, modeloCarro, cargaMaximaCarro);

        System.out.print("Peso da bagagem no Carro (kg): ");
        int pesoCarro = sc.nextInt();
        carro.adicionarBagagem(pesoCarro);

        System.out.println("\nResultados:");
        System.out.println(caminhao);
        System.out.println(van);
        System.out.println(carro);

        sc.close();
    }
}
