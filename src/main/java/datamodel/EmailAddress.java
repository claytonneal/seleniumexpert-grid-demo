package datamodel;

public class EmailAddress {

	private String _value;
	
	public EmailAddress() {
		Long millis = System.currentTimeMillis() % 1000;
		_value = millis.toString() + "@test.com";
	}
	
	public String getAddress() {
		return _value;
	}
	
	public void setAddress(String value) {
		this._value = value;
	}
	
}
