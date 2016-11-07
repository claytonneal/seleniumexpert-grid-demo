package datamodel;

public class MobileNumber {
	
	private String value;
	
	public MobileNumber() {
		Long millis = System.currentTimeMillis();
		Integer len = millis.toString().length();
		value = millis.toString().substring(len-12);
	}
	
	public String getMobileNumber() {
		return value;
	}

}
