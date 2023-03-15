package sauce.demo;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import resources.SaucePageBase;

public class SauceChackoutAssertingPage {
	public WebDriver driver;

	public SauceChackoutAssertingPage(WebDriver driver) {
		this.driver = driver;
	}
	public void itemsAsserting() {
	String [] myItemsinCart = {"Test.allTheThings() T-Shirt (Red)","Sauce Labs Backpack","Sauce Labs Onesie"};
	List<WebElement>cartItems =  driver.findElements(By.cssSelector(".cart_item .inventory_item_name"));
	List<String>mySelectedcart = Arrays.asList(myItemsinCart);
	for(int i = 0; i<cartItems.size(); i++) {
		String onMyCart = cartItems.get(i).getText();
		if(onMyCart.equals(mySelectedcart)) {
			Assert.assertEquals(onMyCart, mySelectedcart);
		}
	}
	}
	public void totalPriceAsseerting() {
		String actualPrice = driver.findElement(By.cssSelector(".summary_total_label")).getText();
		String expectedPrice = "Total: $58.29";
		Assert.assertEquals(actualPrice, expectedPrice);
		driver.findElement(By.cssSelector("#finish")).click();
		String message = driver.findElement(By.cssSelector(".title")).getText();
		String expectedMessage = "CHECKOUT: COMPLETE!";
		Assert.assertEquals(message, expectedMessage);
	}
}
