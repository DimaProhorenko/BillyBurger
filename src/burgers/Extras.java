package burgers;

public enum Extras {
	COKE_SMALL(2.99),
	COKE_MEDIUM(3.99),
	COKE_LARGE(4.99),
	FRENCH_FRIES(3.99);
	
	private final double price;
	
	private Extras(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
}
