package swagLabsPagesTests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import swagLabsAbstractData.SwagLabsBasePage;
import swagLabsmirorPages.SwagLabsCheckoutInfoPage;
import swagLabsmirorPages.SwagLabsCheckoutPage;
import swagLabsmirorPages.SwagLabsMirorCartPage;
import swagLabsmirorPages.SwagLabsOrderCompletedPage;
import swagLabsmirorPages.SwagLabsOrderPage;
import swagLabsmirorPages.SwagLabsProductCataloughePage;

public class SwagLabsStandAlonPracticeTest extends SwagLabsBasePage {
	String productName = "Fleece Jacket";
	List<WebElement> products;

	@Test(dataProvider = "getData", groups = "Validation")
	public void submitOrder(HashMap<String, String> in) throws IOException {

		SwagLabsProductCataloughePage sCataloughePage = landingPage.loginpage(in.get("name"), in.get("pass"));
		products = sCataloughePage.getProdectList();
		sCataloughePage.addProductToCart(in.get("product"));
		SwagLabsMirorCartPage cartPage = sCataloughePage.goToTheCartPage();
		Boolean match = cartPage.verifyProductDisplay(in.get("product"));
		Assert.assertTrue(match);
		SwagLabsCheckoutInfoPage checkoutinfoPage = cartPage.goToCheckout();
		checkoutinfoPage.checkoutInformation("Maisha", "Chowdhury", "11209");
		SwagLabsCheckoutPage checkoutPage = checkoutinfoPage.submitOrder();
		checkoutPage.productPrice();
		checkoutPage.shoppingFinish();
		SwagLabsOrderCompletedPage completePage = new SwagLabsOrderCompletedPage(driver);
		String thankyouMessage = completePage.completeMassege();
		Assert.assertEquals("Thank you for your order!", thankyouMessage);

	}

	@Test(dependsOnMethods = "submitOrder")
	public void orderHistory() {
		SwagLabsProductCataloughePage sCataloughePage = landingPage.loginpage("standard_user", "secret_sauce");
		sCataloughePage.addProductToCart(productName);
		SwagLabsOrderPage orderPage = sCataloughePage.goToTheOrderPage();
		Assert.assertTrue(orderPage.verifyOrderDisplay(productName));
	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = readFileFromJson(
				System.getProperty("user.dir") + "/src/main/java/swagLabsGlobalProperties/swagLabsorders.json");
		return new Object[][] { { data.get(0) }, { data.get(1) } };
//		HashMap<String, String>map = new HashMap<String,String>();
//		map.put("name", "standard_user");
//		map.put("pass", "secret_sauce");
//		map.put("product", "Fleece Jacket");
//		HashMap<String, String>nmap = new HashMap<String,String>();
//		nmap.put("name", "standard_user");
//		nmap.put("pass", "secret_sauce");
//		nmap.put("product", "Bolt T-Shirt");

	}

}
