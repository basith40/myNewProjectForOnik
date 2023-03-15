package saucedemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import saucedemoPages.SaucedemoItemsAddToCartPage;
import saucedemoPages.SaucedemoItemsSortingPage;
import saucedemoPages.SaucedemoLoginPage;


public class SaucedemoPageTest extends BaseSaucedemo{
	@Parameters({"URL"})
	@Test(groups= {"try"})
	public void loudwebsite(String url) {
		System.out.println("My test");
		System.out.println(url);
		
	}
	@Test(dataProvider="getData")
	public void login(String userName, String password) {
		SaucedemoLoginPage sLogin = new SaucedemoLoginPage(driver);
		sLogin.userLogin();
	}
	@Test(dependsOnMethods= {"loudwebsite","login"})
	public void sortingItems() {
		SaucedemoItemsSortingPage sSorting = new SaucedemoItemsSortingPage(driver);
		sSorting.itemsSorting();
	}
	@Test(dependsOnMethods= {"loudwebsite","login"})
	public void addCart() {
		SaucedemoItemsAddToCartPage sAddToCart = new SaucedemoItemsAddToCartPage(driver);
		sAddToCart.addToCart();
	}
	

}
