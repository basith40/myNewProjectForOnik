package sauce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SauceRemoveItemFromCartPage {
	public WebDriver driver;
	public SauceRemoveItemFromCartPage(WebDriver driver) {
		this.driver = driver;
	}
	public void itemRemove() {
		driver.findElements(By.cssSelector(".cart_item button")).get(2).click();
		String cartSize = driver.findElement(By.cssSelector(".shopping_cart_link")).getText();
		Assert.assertEquals(cartSize, "2");
		driver.findElement(By.cssSelector("#continue-shopping")).click();
	
	}

}
