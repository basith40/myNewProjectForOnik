package swagLabsPagesTests;

import org.testng.annotations.Test;

import swagLabsAbstractData.SwagLabsBasePage;
import swagLabsmirorPages.SwagLabsLandingPage;
import swagLabsmirorPages.SwagLabsProductCataloughePage;

public class SwagLabsPositiveTest extends SwagLabsBasePage{
	
	@Test
	public void applicationLaunch() {
		SwagLabsLandingPage login = new SwagLabsLandingPage(driver);
		login.loginpage("standard_user", "secret_sauce");
		
	}
	
	@Test
	public void productsSelect() throws InterruptedException {
		applicationLaunch();
		SwagLabsProductCataloughePage addToCartPage = new SwagLabsProductCataloughePage(driver);
		addToCartPage.addProductToCart("Test.allThe");
//		addToCartPage.itemsSelect();
//		addToCartPage.itemAddToCart();
//		addToCartPage.itemsPage();
//		addToCartPage.itemsSelect2();
//		addToCartPage.itemAddToCart();
//		addToCartPage.itemsPage();
//		addToCartPage.itemsSelect3();
//		addToCartPage.itemAddToCart();
//		addToCartPage.itemsPage();
//		addToCartPage.bag();
	}
	//@Test(groups= {"FirstChack"})
	public void shoppingBagItems() throws InterruptedException {
		productsSelect(); 
	}

}
