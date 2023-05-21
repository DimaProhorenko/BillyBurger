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
		this(Constants.DEFAULT_BURGER_PRICE, Constants.DEFAULT_BURGER_NAME, Constants.DEFAULT_BURGER_MEAT, Constants.DEFAULT_BURGER_BREAD_ROLL_TYPE);
	}

	public Burger(double price, String name, String meat, String breadRollType) {
		this.price = price;
		this.name = name;
		this.meat = meat;
		this.breadRollType = breadRollType;
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
	
	public void addExtra(List<Extras> ex) {
		extras.addAll(ex);
		price += calcExtrasPrice(ex);
	}
	
	private double calcExtrasPrice(List<Extras> extras) {
		return extras.stream().mapToDouble(el -> el.getPrice()).reduce(0, (subtotal, next) -> subtotal + next);
	}

	
	public void setTopings(List<Topings> topings) {
		this.topings = topings;
	}

	public void setExtras(List<Extras> extras) {
		this.extras = extras;
	}
	
	@Override
	public String toString() {
		return String.format("Burger [price=%.2f$, name=%s, meat=%s, breadRollType=%s, topings=%s, extras=%s]", price, name, meat,
				breadRollType, topings, extras);
	}

	
	
	
	
	
}
