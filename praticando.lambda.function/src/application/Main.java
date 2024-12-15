package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import model.entities.Product;
import util.UpperCaseName;

public class Main {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		Function<Product, String> func = p -> p.getName().toUpperCase();	
		
		//ways to implement Function
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		names = list.stream().map(Product::NoStaticUpperCaseName).collect(Collectors.toList());
		names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names = list.stream().map(func).collect(Collectors.toList());
		
		//printing products with consumer interface in the parameter
		names.forEach(System.out::println);
	}

}
