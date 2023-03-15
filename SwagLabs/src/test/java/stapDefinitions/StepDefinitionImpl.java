package stapDefinitions;

import java.io.IOException;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swagLabsAbstractData.SwagLabsBasePage;
import swagLabsmirorPages.SwagLabsCheckoutInfoPage;
import swagLabsmirorPages.SwagLabsCheckoutPage;
import swagLabsmirorPages.SwagLabsLandingPage;
import swagLabsmirorPages.SwagLabsMirorCartPage;
import swagLabsmirorPages.SwagLabsOrderCompletedPage;
import swagLabsmirorPages.SwagLabsProductCataloughePage;

public class StepDefinitionImpl extends SwagLabsBasePage{
	public SwagLabsLandingPage landingPage;
	SwagLabsProductCataloughePage sCataloughePage;
	SwagLabsCheckoutInfoPage checkoutinfoPage;
	SwagLabsOrderCompletedPage completePage;
	@Given("I landed on Ecommerce application")
	public void I_landed_on_Ecommerce_application() throws IOException {
		landingPage = initializeDriver();
	}
	@Given("^I input userid(.+) and user password(.+) in apps$")
	public void input_userid_and_password(String id, String pass) {
		sCataloughePage = landingPage.loginpage(id, pass);
		
	}
	@And("^Select my product(.+)from list$")
	public void select_product_from_list(String prod) {
		sCataloughePage.getProdectList();
		sCataloughePage.addProductToCart(prod);
		SwagLabsMirorCartPage cartPage = sCataloughePage.goToTheCartPage();
		Boolean match = cartPage.verifyProductDisplay(prod);
		Assert.assertTrue(match);
		checkoutinfoPage = cartPage.goToCheckout();
	}
	@When("i submit informatiom for Chackout")
	public void chackout() {
		checkoutinfoPage.checkoutInformation("Maisha", "Chowdhury", "11209");
		SwagLabsCheckoutPage checkoutPage = checkoutinfoPage.submitOrder();
		checkoutPage.productPrice();
		checkoutPage.shoppingFinish();
		completePage = new SwagLabsOrderCompletedPage(driver);
	}
	@Then("{string} message is displayed on confarmation Page")
	public void message_displayed_on_confarmation_page(String string) {
		String thankyouMessage = completePage.completeMassege();
		Assert.assertEquals(string, thankyouMessage);
		driver.close();
	}
	@Then("{string} message is displayed")
	public void errorMessage(String string) {
		String appMessage = landingPage.eMessage();
		Assert.assertEquals(appMessage, string);
		driver.close();
	}

}

