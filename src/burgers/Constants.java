package burgers;
import java.util.List;

import topings.Topings;
import java.util.ArrayList;
import java.util.Arrays;

public class Constants {
	public static final double DEFAULT_BURGER_PRICE = 3.99;
	public static final String DEFAULT_BURGER_NAME = "Standart burger";
	public static final String DEFAULT_BURGER_MEAT = "Chicken";
	public static final String DEFAULT_BURGER_BREAD_ROLL_TYPE = "Classic bread roll";
	public static final int DEFAULT_BURGER_MAX_TOPPINGS_NUM = 4;
	
	public static final double DELUXE_BURGER_PRICE = 19.99;
	public static final String DELUXE_BURGER_NAME = "Deluxe burger";
	public static final String DELUXE_BURGER_MEAT = "Pork and Ham";
	public static final String DELUXE_BURGER_BREAD_ROLL_TYPE = "Premium dark bread roll";
	public static final List<Topings> DELUXE_BURGER_TOPPINGS = new ArrayList<>(Arrays.asList(Topings.CHEESE, Topings.TOMATO, Topings.LETTUSE));
	public static final List<Extras> DELUXE_BURGER_EXTRAS = new ArrayList<>(Arrays.asList(Extras.COKE_LARGE));
}
