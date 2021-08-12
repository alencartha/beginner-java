package application;

import java.util.Scanner;

import entities.Products;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Products products = new Products();

		System.out.println("Enter product data:");

		System.out.print("Name:");
		products.name = sc.next();

		System.out.print("Price:");
		products.price = sc.nextDouble();

		System.out.print("Quantity:");
		products.quantity = sc.nextInt();

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
