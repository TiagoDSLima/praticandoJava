package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int qtA = sc.nextInt();
		for(int i = 0; i < qtA; i++) {
			a.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		int qtB = sc.nextInt();
		for(int i = 0; i < qtB; i++) {
			b.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		int qtC = sc.nextInt();
		for(int i = 0; i < qtC; i++) {
			c.add(sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}

}
