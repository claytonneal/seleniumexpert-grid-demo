package datamodel;

public class Password {
	
	private String value;
	
	public Password() {
		Long millis = System.currentTimeMillis();
		Integer len = millis.toString().length();
		value = millis.toString().substring(len-8);
	}
	
	public String getPassword() {
		return value;
	}

}
