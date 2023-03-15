package uberPages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import uberAbstract.Abstracts;

public class OrderPage extends Abstracts {
	WebDriver driver;

	public OrderPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[text()='Got it']")
	WebElement cookisAccept;

	@FindBy(css = ".h6")
	List<WebElement> links;
	
	@FindBy(css = "#location-typeahead-home-input")
	WebElement addressEntry;

	public void accept() {
		cookisAccept.click();
	}

	public void countrySelect() {
		WebElement selectedCountry = links.stream()
				.filter(country -> country.findElement(By.cssSelector("span")).getText().equals("Dallas")).findFirst()
				.orElse(null);
		selectedCountry.findElement(By.cssSelector("span")).click();
	}

	public void enterAddress() {
		Actions action = new Actions(driver);
		action.sendKeys(addressEntry, "jamaica avenue").build().perform();

	}

}
