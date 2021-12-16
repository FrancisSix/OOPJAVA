import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner scann = new Scanner(System.in);
		
		
		Product product = new Product();		
		System.out.println("Enter the product data: ");
		System.out.print("Name: ");
		product.name = scann.nextLine();
		System.out.print("Price: ");
		product.price = scann.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scann.nextInt();
		
		System.out.println(product.name + ", "+ product.price + ", "+ product.quantity);
		scann.close();
	}

}
