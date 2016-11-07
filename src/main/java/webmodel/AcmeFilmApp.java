package webmodel;

import org.openqa.selenium.WebDriver;
import common.ElementService;
import common.IWebApp;
import common.IWebPage;
import common.WebDriverFactory;

/*
 * Class to represent the Acme film web app
 */
public class AcmeFilmApp implements IWebApp {
	
	//properties
	private WebDriver _driver;
	private ElementService _elementservice;
	private static final String homepageUrl = "http://grid-tools-downloads.com/testpages/form2.html";
	private IWebPage homepageClass = (IWebPage)new RegisterPage();
	
	
	/*
	 * Opens the browser to the app homepage
	 */
	public void OpenApp(String testname) throws Exception {
		if (_driver == null) {
			this._driver = WebDriverFactory.GetWebDriver(testname);
			this._elementservice = new ElementService(_driver);
		} 
		_driver.get(homepageUrl);
		homepageClass.WaitForPage();
	}

	/*
	 * Closes the browser
	 */
	public void CloseApp() {
		_driver.quit();
		_driver = null;
		_elementservice = null;
	}

	/*
	 * Gets the element service for the app
	 */
	public ElementService GetElementService() {
		return _elementservice;
	}
	

	
}
