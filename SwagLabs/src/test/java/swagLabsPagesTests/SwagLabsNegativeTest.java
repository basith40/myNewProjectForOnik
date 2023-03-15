package swagLabsPagesTests;

import org.testng.annotations.Test;

import swagLabsAbstractData.SwagLabsBasePage;
import swagLabsmirorPages.SwagLabsLandingPage;

public class SwagLabsNegativeTest extends SwagLabsBasePage{
	
	@Test(dataProvider = "users")
	public void userTest(String name, String pass) {
		SwagLabsLandingPage login = new SwagLabsLandingPage(driver);
		login.loginpage(name, pass);
		
	}

}
