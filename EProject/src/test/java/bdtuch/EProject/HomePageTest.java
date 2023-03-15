package bdtuch.EProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.LoginPage;
import pages.AdminHomePage;
import pages.LoginPageUserName;

public class HomePageTest extends Base{
	@Test(dataProvider = "getData")
	public void landingPage(String uid, String upassword) {
		driver.get(prop.getProperty("url"));
		LoginPage lp = new LoginPage(driver);
		lp.id().sendKeys(uid);
		lp.password().sendKeys(upassword);
		lp.login().click();
		lp.adminHome().isDisplayed();
		String massege = lp.adminHome().getText().split(" ")[0];
		Assert.assertEquals(massege, "Welcome");
		AdminHomePage adp = new AdminHomePage(driver);
		System.out.println(adp.pageLinks().findElements(By.tagName("a")).size());
//		LoginPageUserName lpu = new LoginPageUserName(driver);
//		lpu.id().sendKeys(uid);
//		lpu.pageNext().click();
//		LoginPagePassword lpp = new LoginPagePassword(driver);
//		lpp.userPassword().sendKeys(upassword);
//		lpp.pageSingin().click();
//		String massege = lpp.errorMassege().getText();
//		AssertJUnit.assertEquals(massege, "There was a problem");


		
	}
	

}
