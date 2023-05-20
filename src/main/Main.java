package main;
import burgers.*;
import topings.Topings;

public class Main {
	public static void main(String[] args) {
		Burger classic = new Burger();
		classic.addToping(Topings.CHEESE);
		classic.addToping(Topings.TOMATO);
		classic.addToping(Topings.LETTUSE);
		classic.addToping(Topings.CHEESE);
		classic.addToping(Topings.TOMATO);
		classic.addExtra(Extras.COKE_LARGE);
		
		System.out.println(classic);
	}
	
}
