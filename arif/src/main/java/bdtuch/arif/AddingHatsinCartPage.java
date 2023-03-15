package bdtuch.arif;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.PageBase;

public class AddingHatsinCartPage extends PageBase {
	WebDriver driver;

	public AddingHatsinCartPage(WebDriver driver) {
		super(driver);

	}

	// @FindBy(css = "#a-autoid-13")
	WebElement quantitySearch = driver.findElement(By.cssSelector("#a-autoid-13"));
	List<WebElement> quantity = driver.findElements(By.xpath("//*[@class='a-popover-wrapper']/div/ul/li"));

	public WebElement itemQuantity() {
		return quantitySearch;
	}

	public void iQuantity() {
		quantity.get(1).click();
	}
}
