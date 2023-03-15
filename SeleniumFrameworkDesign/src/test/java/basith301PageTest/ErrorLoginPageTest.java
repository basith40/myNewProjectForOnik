package basith301PageTest;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import basith301.AppPage.ErrorLoginPage;
import basith301.AppPage.LandingPage;
import basith301BasePageTest.BasePageTest;

public class ErrorLoginPageTest extends BasePageTest{
	@Test(groups = {"Error"})
	public void loginError() {
		ErrorLoginPage elogin = new ErrorLoginPage(driver);
		elogin.loginto("basith301@gmai.com", "345");
		AssertJUnit.assertEquals("Incorrect email or password." , elogin.message());
	}
	@Test
	public void secondLoginError() {
		LandingPage error = new LandingPage(driver);
		error.loginError2("hasan@aol.com", "7834rt");
		
	}

}
