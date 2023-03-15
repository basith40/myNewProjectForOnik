package sauce.demo;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.SaucePageBase;

public class SauceAddItemsToTheCartPage {
	WebDriver driver;
	public SauceAddItemsToTheCartPage(WebDriver driver) {
		this.driver = driver;
	}
	public void myCart() {
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='inventory_list'] //div[@class='inventory_item_name']"));
		String []myItems = {"Test.allTheThings() T-Shirt (Red)","Sauce Labs Backpack","Sauce Labs Fleece Jacket"};
		for(int i = 0; i<items.size(); i++) {
			String allitems = items.get(i).getText();
			List<String>itemNeeded = Arrays.asList(myItems);
			if(itemNeeded.contains(allitems)) {
				driver.findElements(By.cssSelector(".pricebar button")).get(i).click();
			}
		}
		driver.findElement(By.cssSelector("#shopping_cart_container")).click();
	}

}
