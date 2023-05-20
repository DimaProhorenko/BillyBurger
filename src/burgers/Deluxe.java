package burgers;

public class Deluxe extends Burger {

	public Deluxe() {
		this(Constants.DELUXE_BURGER_PRICE, Constants.DELUXE_BURGER_NAME, Constants.DELUXE_BURGER_MEAT, Constants.DELUXE_BURGER_BREAD_ROLL_TYPE);
		// TODO Auto-generated constructor stub
	}

	public Deluxe(double price, String name, String meat, String breadRollType) {
		super(price, name, meat, breadRollType);
		super.setTopings(Constants.DELUXE_BURGER_TOPPINGS);
		super.setExtras(Constants.DELUXE_BURGER_EXTRAS);
		// TODO Auto-generated constructor stub
	}
	
}
