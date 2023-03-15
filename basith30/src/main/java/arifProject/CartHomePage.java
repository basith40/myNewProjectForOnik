package arifProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartHomePage extends ArifPageBase{

	public CartHomePage(WebDriver driver) {
		super(driver);
	}
	public void pageAssert() {
		driver.findElement(By.cssSelector("#shopping_cart_container")).click();
		
	}

}
