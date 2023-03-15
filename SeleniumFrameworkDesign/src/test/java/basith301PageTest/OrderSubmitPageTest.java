package basith301PageTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basith301.AppPage.CartPage;
import basith301.AppPage.CheckoutPage;
import basith301.AppPage.ProductCataloguePage;
import basith301.AppPage.confarmationPage;
import basith301BasePageTest.BasePageTest;

public class OrderSubmitPageTest extends BasePageTest {

	@Test(dataProvider = "getData",groups = {"PurchaseTest"})
	public void submitOrder(HashMap<String, String> input) throws InterruptedException {
		
		ProductCataloguePage pCatalog = lPage.webLogin(input.get("email"), input.get("password"));
		pCatalog.getProductList();
		pCatalog.addProductToCart(input.get("productName"));
		pCatalog.goToTheCartPage();
		CartPage cPage = new CartPage(driver);
		boolean mach = cPage.verifyProductDisplay(input.get("productName"));
		AssertJUnit.assertTrue(mach);
		CheckoutPage checkoutPage = cPage.goToCheckout();
		checkoutPage.selectCountry("Australia");
		confarmationPage cpage2 = checkoutPage.submitTheOrder();
		String confurmMessage = cpage2.myconfarmationMessage();
		AssertJUnit.assertTrue(confurmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

	}

	@Test(groups = { "buy-the-items" })
	public void submitOrder2() throws InterruptedException {
		
		String productName = "ADIDAS ORIGINAL";
		ProductCataloguePage pCatalog = lPage.webLogin("basith301@yahoo.com", "301Basith");
		pCatalog.getProductList();
		pCatalog.addProductToCart(productName);
		pCatalog.goToTheCartPage();
		CartPage cPage = new CartPage(driver);
		boolean mach = cPage.verifyProductDisplay(productName);
		AssertJUnit.assertTrue(mach);
		CheckoutPage checkoutPage = cPage.goToCheckout();
		checkoutPage.selectCountry("Bangladesh");
		confarmationPage cpage2 = checkoutPage.submitTheOrder();
		String confurmMessage = cpage2.myconfarmationMessage();
		AssertJUnit.assertTrue(confurmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		List<HashMap<String, String>> mydata = getjsonDataToMap(System.getProperty("user.dir")+"/src/test/java/basith301data/parchaseOrder.json");
		Object[][] objects = {{mydata.get(0)}, {mydata.get(1)}};
		return objects;

	}
}
