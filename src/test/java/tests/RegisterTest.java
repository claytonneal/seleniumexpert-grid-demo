package tests;

import webmodel.RegisterPage;
import org.testng.annotations.Test;
import com.flextrade.jfixture.JFixture;
import datamodel.Person;
import junit.framework.Assert;

public class RegisterTest extends BaseTest {

	@Test(description="Attempts to register with an invalid email address")
	public void InvalidEmailFormat() throws Exception {
		//setup data
		JFixture fixture = new JFixture();
		Person person = fixture.create(Person.class);
		person.EmailAddress.setAddress("invalid email address");
		//fill data
		RegisterPage regpage = new RegisterPage();
		regpage.FillPage(person);
		regpage.SubmitPage();
		//assert on error message
		String errortext = regpage.getEmailErrorMessage();
		Assert.assertTrue(errortext.contains("Invalid email"));
	}
	
	@Test(description="Attempts to register with an empty email address")
	public void MissingEmail() throws Exception {
		//setup data
		JFixture fixture = new JFixture();
		Person person = fixture.create(Person.class);
		person.EmailAddress.setAddress("");
		//fill data
		RegisterPage regpage = new RegisterPage();
		regpage.FillPage(person);
		regpage.SubmitPage();
		//assert on error message
		String errortext = regpage.getEmailErrorMessage();
		Assert.assertTrue(errortext.contains("Invalid email"));
	}
	
	@Test(description="Attempts to register with an empty first name")
	public void MissingFirstName() throws Exception {
		//setup data
		JFixture fixture = new JFixture();
		Person person = fixture.create(Person.class);
		person.FirstName = "";
		//fill data
		RegisterPage regpage = new RegisterPage();
		regpage.FillPage(person);
		regpage.SubmitPage();
		//assert on error message
		String errortext = regpage.getFirstNameErrorMessage();
		Assert.assertTrue(errortext.contains("please enter your first name"));
	}
	
	@Test(description="Attempts to register with an empty last name")
	public void MissingLastName() throws Exception {
		//setup data
		JFixture fixture = new JFixture();
		Person person = fixture.create(Person.class);
		person.LastName = "";
		//fill data
		RegisterPage regpage = new RegisterPage();
		regpage.FillPage(person);
		regpage.SubmitPage();
		//assert on error message
		String errortext = regpage.getLastNameErrorMessage();
		Assert.assertTrue(errortext.contains("please enter your last name"));
	}
	
	@Test(description="Attempts to register with an empty title")
	public void MissingTitle() throws Exception {
		//setup data
		JFixture fixture = new JFixture();
		Person person = fixture.create(Person.class);
		person.Title = null;
		//fill data
		RegisterPage regpage = new RegisterPage();
		regpage.FillPage(person);
		regpage.SubmitPage();
		//assert on error message
		String errortext = regpage.getTitleErrorMessage();
		Assert.assertTrue(errortext.contains("must choose a title"));
	}
	
	@Test(description="Attempts to register with an empty age")
	public void MissingAge() throws Exception {
		//setup data
		JFixture fixture = new JFixture();
		Person person = fixture.create(Person.class);
		person.Age = null;
		//fill data
		RegisterPage regpage = new RegisterPage();
		regpage.FillPage(person);
		regpage.SubmitPage();
		//assert on error message
		String errortext = regpage.getAgeErrorMessage();
		Assert.assertTrue(errortext.contains("Must input age"));
	}
}
