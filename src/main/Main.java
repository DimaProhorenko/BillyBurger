package main;
import burgers.*;
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
		menu.checkIfMenuOptionsContains("classic");
		MenuOptions burgerChoise = menu.pickBurger();
		System.out.println(burgerChoise);
	}
	
}
