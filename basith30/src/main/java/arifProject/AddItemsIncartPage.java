package arifProject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddItemsIncartPage extends ArifPageBase {

	public AddItemsIncartPage(WebDriver driver) {
		super(driver);
	}

	public void cart() {
		String[] items = { "Sauce Labs Bolt T-Shirt", "Sauce Labs Onesie", "Sauce Labs Fleece Jacket" };
		List<WebElement> opton = driver.findElements(By.cssSelector(".inventory_item_description a"));
		for (int i = 0; i < opton.size(); i++) {
			String myopton = opton.get(i).getText();
			List<String> myitems = Arrays.asList(items);
			if (myitems.contains(myopton)) {
				driver.findElements(By.cssSelector(".pricebar button")).get(i).click();
			}
		}
		driver.findElement(By.cssSelector("#shopping_cart_container")).click();
	}

}
