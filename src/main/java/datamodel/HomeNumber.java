package datamodel;

public class HomeNumber {
	
private String value;
	
	public HomeNumber() {
		Long millis = System.currentTimeMillis();
		Integer len = millis.toString().length();
		value = millis.toString().substring(len-7);
	}
	
	public String getHomeNumber() {
		return value;
	}

}
