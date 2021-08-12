package entities;

public class Products {

	private String name;
	private double price;
	private int quantity;
	
	public String setName(String name) {
		return this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	//Constructor:
	
	public Products(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//sobrecarga - uma op��o para passar apenas dois par�metros no construtor, o valor padr�o de int quantity, � zero
	
	public Products(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueinStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f",totalValueinStock());
	}
}
