package main;
import java.util.Scanner;

import burgers.MenuOptions;

public class Menu {
	private Scanner scanner;
	
	public Menu(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public static boolean checkIfMenuOptionsContains(String value) {
		boolean result = false;
		
		for(MenuOptions mo:MenuOptions.values()) {
			if(mo.getType().equalsIgnoreCase(value)) {
				result = true;
				break;
			}
		}
		
		return result;
	}

	public MenuOptions pickBurger() {
		String pick;
		while(true) {
			System.out.println("Enter burger name (Classic, Deluxe): ");
			pick = scanner.nextLine();
			if ("Qq".contains(pick) || Menu.checkIfMenuOptionsContains(pick)) {
				break;
			}
		}
		
		return getMenuOption(pick);
	}
	
	private MenuOptions getMenuOption(String value) {
		MenuOptions option = null;
		for(MenuOptions el : MenuOptions.values()) {
			if(el.getType().equalsIgnoreCase(value)) {
				option = el;
			}
		}
		
		return option;
	}
}
