package application;

import java.util.Scanner;

import entities.Products;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter product data:");

		System.out.print("Name:");
		String name = sc.next();

		System.out.print("Price:");
		double price = sc.nextDouble();

		System.out.print("Quantity:");
		int quantity = sc.nextInt();
		
		Products products = new Products(name, price, quantity);
		
		products.setName("Computer");
		System.out.println("Update name: " + products.getName());

		System.out.println();
		System.out.println("Product data: " + products.toString());

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantityAdd = sc.nextInt();
		products.addProducts(quantityAdd);

		System.out.println();
		System.out.println("Update data: " + products.toString());

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int quantityRemove = sc.nextInt();
		products.removeProducts(quantityRemove);

		System.out.println();
		System.out.println("Update data: " + products.toString());

		sc.close();

	}

}
