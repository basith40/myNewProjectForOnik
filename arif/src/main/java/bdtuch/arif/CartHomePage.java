package bdtuch.arif;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.PageBase;

public class CartHomePage extends PageBase {
	WebDriver driver;

	public CartHomePage(WebDriver driver) {
		super(driver);
	}

	List<WebElement> itemsChack = driver.findElements(By.xpath("//div[@class='a-popover-wrapper']/div/ul/li"));

	public WebElement itemsAssert() {
		return itemsChack.get(1);

	}

}
