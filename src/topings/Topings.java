package topings;

public enum Topings {
	TOMATO(0.27),
	CHEESE(1.22),
	LETTUSE(0.86);
	
	public final double price;
	
	private Topings(double price) {
		this.price = price;
	}
	
}
