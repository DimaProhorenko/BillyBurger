package burgers;

public enum MenuOptions {
	PICK_CLASSIC_BURGER("classic"),
	PICK_DELUXE_BURGER("deluxe");
	
	private final String type;
	
	private MenuOptions(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
