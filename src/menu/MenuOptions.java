package menu;

public enum MenuOptions {
	PICK_CLASSIC_BURGER("classic"),
	PICK_DELUXE_BURGER("deluxe"),
	PICK_COKE_SMALL("coke small"),
	PICK_COKE_MEDIUM("coke medium"),
	PICK_COKE_LARGE("coke large"),
	PICK_FRENCH_FRIES("french fries"),
	PICK_TOMATO("tomato"),
	PICK_CHEESE("cheese"),
	PICK_LETTUSE("lettuse");
	
	private final String type;
	
	private MenuOptions(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
