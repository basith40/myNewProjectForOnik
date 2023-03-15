package stapDefination;

import java.io.IOException;
import org.testng.Assert;
import basith301.AppPage.CartPage;
import basith301.AppPage.CheckoutPage;
import basith301.AppPage.LandingPage;
import basith301.AppPage.ProductCataloguePage;
import basith301.AppPage.confarmationPage;
import basith301BasePageTest.BasePageTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StapDefinationimpliment extends BasePageTest{
	public LandingPage lPage;
	public ProductCataloguePage pCatalog;
	public CartPage cPage; 
	public confarmationPage cpage2;
	@Given("i landing on ecommerce page")
	public void i_landing_on_ecommerce_page() throws IOException {
		lPage = launchApplication();		
	}
	@Given("^I login with username (.+) and userpassword (.+)$")
	public void login_with_username_and_userpassword(String username, String userpassword){
		 pCatalog = lPage.webLogin(username, userpassword);		
	}
	@When("^I add a product in cart(.+)$")
	public void add_a_product_in_cart(String product) throws InterruptedException {
		pCatalog.getProductList();
		pCatalog.addProductToCart(product);		
	}
	@And("^chackout (.+) submit order$")
	public void chackout_submit_order(String product) {
		cPage = new CartPage(driver);
		boolean mach = cPage.verifyProductDisplay(product);
		Assert.assertTrue(mach);
		CheckoutPage checkoutPage = cPage.goToCheckout();
		checkoutPage.selectCountry("Bangladesh");
		cpage2 = checkoutPage.submitTheOrder();
	}
	@Then ("I verify the return message {string}")
	public void I_verify_the_return_message(String string) {
		String confurmMessage = cpage2.myconfarmationMessage();
		Assert.assertTrue(confurmMessage.equalsIgnoreCase(string));
		driver.close();
	}

}
