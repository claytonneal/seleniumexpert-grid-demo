package webmodel;

import org.openqa.selenium.By;
import common.IWebPage;
import datamodel.Person;

/*
 * Class to represent the register page
 */
public class RegisterPage implements IWebPage {

	//controls
	private static final By cssFirstName = By.cssSelector("input#Name");
	private static final By cssLastName = By.cssSelector("input#LName");
	private static final By cssTitle = By.cssSelector("select#Title");
	private static final By cssAge = By.cssSelector("input#Age");
	private static final By cssEmailAddress = By.cssSelector("input#EMail");
	private static final By cssConfirmEmailAddress = By.cssSelector("input#EMail2");
	private static final By cssPassword = By.cssSelector("input#Pass1");
	private static final By cssConfirmPassword = By.cssSelector("input#Pass2");
	private static final By cssMobileNumber = By.cssSelector("input#Mob");
	private static final By cssHomeNumber = By.cssSelector("input#Hom");
	private static final By cssAddressLine1 = By.cssSelector("input#add");
	private static final By cssAddressLine2 = By.cssSelector("input#add2");
	private static final By cssCity = By.cssSelector("input#City");
	private static final By cssCountry = By.cssSelector("select#Country");
	private static final By cssHowFind = By.cssSelector("select#Howfound");
	private static final By cssOther = By.cssSelector("input#Other");
	private static final By cssFutureOffers = By.cssSelector("input#futureoffers");
	private static final By cssTermsAndConditions = By.cssSelector("input#Tnc");
	private static final By cssSubmit = By.cssSelector("input#saveForm");
	
	//error messages
	private static final By cssFirstNameErrorMessage = By.cssSelector("span#firstnamemessage");
	private static final By cssLastNameErrorMessage = By.cssSelector("span#lastnamemessage");
	private static final By cssTitleErrorMessage = By.cssSelector("span#titlemessage");
	private static final By cssAgeErrorMessage = By.cssSelector("span#AgeMessage");
	private static final By cssEmailErrorMessage = By.cssSelector("span#email1message");
	
	@Override
	public void WaitForPage() throws Exception {
		// Waits for the FirstName element to be visible
		WebAppManager.getWebApp().GetElementService().WaitForElement(cssFirstName);
	}
	
	// Fills the page from a person object
	public void FillPage(Person person) throws Exception {
		//firstname
		if ((person.FirstName != null) && (!person.FirstName.isEmpty())) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssFirstName, person.FirstName);
		}
		//lasname
		if ((person.LastName != null) && (!person.LastName.isEmpty())) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssLastName, person.LastName);
		}
		//title
		if (person.Title != null) {
			WebAppManager.getWebApp().GetElementService().SelectDropDownItem(cssTitle, person.Title.toString());
		}
		//age
		if (person.Age != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssAge, person.Age.toString());
		}
		//email
		if (person.EmailAddress != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssEmailAddress, person.EmailAddress.getAddress());
		}
		//confirm email
		if (person.EmailAddress != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssConfirmEmailAddress, person.EmailAddress.getAddress());
		}
		//password
		if (person.Password != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssPassword, person.Password.getPassword());
		}
		//confirm password
		if (person.Password != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssConfirmPassword, person.Password.getPassword());
		}
		//mobile
		if (person.MobileNumber != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssMobileNumber, person.MobileNumber.getMobileNumber());
		}
		//home number
		if (person.HomeNumber != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssHomeNumber, person.HomeNumber.getHomeNumber());
		}
		//address line 1
		if (person.AddressLine1 != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssAddressLine1, person.AddressLine1);
		}
		//address line 2
		if (person.AddressLine2 != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssAddressLine2, person.AddressLine2);
		}
		//city
		if (person.City != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssCity, person.City);
		}
		//country
		if (person.Country != null) {
			WebAppManager.getWebApp().GetElementService().SelectDropDownItem(cssCountry, person.Country.toString());
		}
		//how find us
		if (person.HowFindUs != null) {
			WebAppManager.getWebApp().GetElementService().SelectDropDownItem(cssHowFind, person.HowFindUs.toString());
		}
		//find us other
		if (person.Other != null) {
			WebAppManager.getWebApp().GetElementService().EnterText(cssOther, person.Other);
		}
		//future emails
		if (person.ReceiveFuture != null) {
			WebAppManager.getWebApp().GetElementService().SetRadioButtonState(cssFutureOffers, person.ReceiveFuture);
		}
		//accept t&c
		if (person.AcceptTC != null) {
			WebAppManager.getWebApp().GetElementService().SetRadioButtonState(cssTermsAndConditions, person.AcceptTC);
		}
		
	}
	
	// Clicks on the submit button
	public void SubmitPage() throws Exception {
		WebAppManager.getWebApp().GetElementService().ClickElement(cssSubmit);
	}

	// Gets displayed error message for email field
	public String getEmailErrorMessage() throws Exception {
		return WebAppManager.getWebApp().GetElementService().GetElementText(cssEmailErrorMessage);
	}
	
	// Gets displayed error message for first name field
	public String getFirstNameErrorMessage() throws Exception {
		return WebAppManager.getWebApp().GetElementService().GetElementText(cssFirstNameErrorMessage);
	}
	
	// Gets displayed error message for last name field
	public String getLastNameErrorMessage() throws Exception {
		return WebAppManager.getWebApp().GetElementService().GetElementText(cssLastNameErrorMessage);
	}
	
	// Gets displayed error message for title field
	public String getTitleErrorMessage() throws Exception {
		return WebAppManager.getWebApp().GetElementService().GetElementText(cssTitleErrorMessage);
	}
	
	// Gets displayed error message for title field
	public String getAgeErrorMessage() throws Exception {
		return WebAppManager.getWebApp().GetElementService().GetElementText(cssAgeErrorMessage);
	}
	
	
}
