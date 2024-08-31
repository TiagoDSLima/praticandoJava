package application;

import java.util.Scanner;
import entities.Carro;
import entities.Moto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		carro.acelerar();
		carro.frear();
		moto.acelerar();
		moto.frear();

		sc.close();
	}

}
