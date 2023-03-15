package swagLabsPagesTests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import swagLabsAbstractData.SwagLabsBasePage;
import swagLabsmirorPages.SwagLabsOrderPage;
import swagLabsmirorPages.SwagLabsProductCataloughePage;

public class ErrorValidationsTest extends SwagLabsBasePage {
	@Test
	public void loginErrorValidation() throws IOException {
		
		landingPage.loginpage("standard_use", "secret_sauce");
		String appMessage = landingPage.eMessage();
		Assert.assertEquals(appMessage, "Epic sadface: Username and password do not match any user in this service");
		
	}
	@Test
	public void productErrorValidation() throws IOException {
		String productName = "Onesie";	
		SwagLabsProductCataloughePage sCataloughePage = landingPage.loginpage("standard_user", "secret_sauce");
		sCataloughePage.getProdectList();
		sCataloughePage.addProductToCart(productName);
		SwagLabsOrderPage cartPage = sCataloughePage.goToTheOrderPage();
		Boolean match = cartPage.verifyOrderDisplay(productName);
		Assert.assertTrue(match);
		
	}
	
}
