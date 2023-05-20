package burgers;
import java.util.List;

import topings.Topings;

import java.util.ArrayList;

public class Burger {
	private double price;
	private String name;
	private String meat;
	private String breadRollType;
	private List<Topings> topings = new ArrayList<>();
	private List<Extras> extras = new ArrayList<>();
	
	public Burger() {
		this.price = Constants.DEFAULT_BURGER_PRICE;
		this.name = Constants.DEFAULT_BURGER_NAME;
		this.meat = Constants.DEFAULT_BURGER_MEAT;
		this.breadRollType = Constants.DEFAULT_BURGER_BREAD_ROLL_TYPE;
	}
	
	public void addToping(Topings t) {
		if(topings.size() < Constants.DEFAULT_BURGER_MAX_TOPPINGS_NUM) {
			topings.add(t);
			price += t.price;
		} else {
			System.out.println(String.format("%s can't have more than %s toppings", name, Constants.DEFAULT_BURGER_MAX_TOPPINGS_NUM));
		}
	}
	
	public void addExtra(Extras extra) {
		extras.add(extra);
		price += extra.getPrice();
	}
	
	private double calcBurgerPrice() {
		return topings.stream().mapToDouble(el -> el.price).reduce(0, (subtotal, next) -> subtotal + next);
	}

	@Override
	public String toString() {
		return String.format("Burger [price=%.2f$, name=%s, meat=%s, breadRollType=%s, topings=%s, extras=%s]", price, name, meat,
				breadRollType, topings, extras);
	}

	
	
	
	
	
}
