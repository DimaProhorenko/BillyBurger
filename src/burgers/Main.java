package burgers;

import topings.Topings;

public class Main {
	public static void main(String[] args) {
		Burger classic = new Burger();
		classic.addToping(Topings.CHEESE);
		classic.addToping(Topings.TOMATO);
		classic.addToping(Topings.LETTUSE);
		classic.addToping(Topings.CHEESE);
		System.out.println(classic);
	}
}
