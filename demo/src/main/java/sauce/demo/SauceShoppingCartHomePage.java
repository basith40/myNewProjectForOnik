package sauce.demo;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class SauceShoppingCartHomePage {
	public WebDriver driver;

	public SauceShoppingCartHomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void itemsAsserting() {
		String []myItems = {"Test.allTheThings() T-Shirt (Red)","Sauce Labs Backpack","Sauce Labs Fleece Jacket"};
		List<WebElement>myCart = driver.findElements(By.cssSelector(".cart_contents_container .inventory_item_name"));
		List<String>mySelectedItems = Arrays.asList(myItems);
		for(WebElement itemsList : myCart) {
			String allItemsInCart = itemsList.getText();
			if(allItemsInCart.equals(mySelectedItems))
			Assert.assertEquals(allItemsInCart, mySelectedItems);
		}
		
	}
	

}
