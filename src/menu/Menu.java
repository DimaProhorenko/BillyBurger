package menu;
import java.util.*;
import menu.*;
import topings.Topings;
import burgers.*;

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
			if ("Qq".contains(pick) || Menu.checkIfMenuOptionsContains(pick.toLowerCase())) {
				break;
			}
		}
		
		return getMenuOption(pick);
	}
	
	public Burger createBurger(MenuOptions choise) {
		MenuOptions m = MenuOptions.PICK_DELUXE_BURGER;
		return switch(choise) {
			
		case PICK_DELUXE_BURGER -> new Deluxe();
			default -> new Burger();
		};
	}
	
	public void addExtras(Burger burger) {
		List<Extras> extras = new ArrayList<>();
		while(true) {
			System.out.println("Add extras: Coke-small, coke-medium, coke-large, french fries");
			String choise = scanner.nextLine();
			if(checkIfMenuOptionsContains(choise)) {
//				extras.add(generateExtra(getMenuOption(choise)));
				burger.addExtra(generateExtra(getMenuOption(choise)));
				System.out.println(choise + " added");
			} else if("Qq".contains(choise)) {
				break;
			} else {
				System.out.println("Not valid option: ");
			}
 		}
		
//		burger.addExtra(extras);
	}
	
	public void addTopings(Burger burger) {
		while(true) {
			System.out.println("Add topings: tomato, cheese, lettuse: ");
			String choise = scanner.nextLine();
			if(checkIfMenuOptionsContains(choise)) {
				burger.addToping(generateToping(getMenuOption(choise)));
				System.out.println(choise + " added");
			} else if("Qq".contains(choise)) {
				break;
			} else {
				System.out.println("Not valid option: ");
			}
 		}
	}
	
	private Extras generateExtra(MenuOptions choise) {
		return switch(choise) {
		case PICK_COKE_SMALL -> Extras.COKE_SMALL;
		case PICK_COKE_MEDIUM -> Extras.COKE_MEDIUM;
		case PICK_COKE_LARGE -> Extras.COKE_LARGE;
		case PICK_FRENCH_FRIES -> Extras.FRENCH_FRIES;
		default -> Extras.COKE_LARGE;
		};
	}
	
	private Topings generateToping(MenuOptions choise) {
		return switch(choise) {
		case PICK_TOMATO -> Topings.TOMATO;
		case PICK_CHEESE -> Topings.CHEESE;
		case PICK_LETTUSE -> Topings.LETTUSE;
		default -> Topings.CHEESE;
		};
	}
	
	private MenuOptions getMenuOption(String value) {
		MenuOptions option = null;
		for(MenuOptions el : MenuOptions.values()) {
			if(el.getType().equalsIgnoreCase(value)) {
				option = el;
				break;
			}
		}
		
		return option;
	}
}
