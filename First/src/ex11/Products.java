package ex11;

public enum Products {
	MILK(2.20),
	BREAD(2.40),
	BUTTER(3.99),
	HAM(25.99),
	CHEESE(21.00),
	SUGAR(4.59),
	SALT(1.50),
	VINEGAR(1.99),
	EGGS(6.00),
	CHOCOLATE(3.10);
	
	private double price;
	
	Products(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}