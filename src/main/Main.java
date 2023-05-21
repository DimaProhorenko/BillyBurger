package main;
import burgers.*;
import menu.Menu;
import menu.MenuOptions;
import topings.Topings;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Burger classic = new Burger();
//		classic.addToping(Topings.CHEESE);
//		classic.addToping(Topings.TOMATO);
//		classic.addToping(Topings.LETTUSE);
//		classic.addToping(Topings.CHEESE);
//		classic.addToping(Topings.TOMATO);
//		classic.addExtra(Extras.COKE_LARGE);
//		
////		System.out.println(classic);
//		
//		Burger deluxe = new Deluxe();
//		deluxe.addExtra(Extras.FRENCH_FRIES);
//		System.out.println(deluxe);
		
		Menu menu = new Menu(scanner);
		
		MenuOptions burgerChoise = menu.pickBurger();
		Burger burger = menu.createBurger(burgerChoise);
		menu.addExtras(burger);
		menu.addTopings(burger);
		System.out.println(burger);
	}
	
}
