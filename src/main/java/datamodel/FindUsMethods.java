package datamodel;

public enum FindUsMethods {
	WordOfMouth ("Word of mouth"),
	SearchEngine ("Search engine"),
	Other ("Other");
	
	private final String text;
	
	private FindUsMethods(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
}
