package basith301.AppPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basith301.AbstractComponents.AbstractComponents;

public class CheckoutPage extends AbstractComponents{
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(css = "input[placeholder='Select Country']")
	WebElement country;
	@FindBy(css = "section.ta-results")
	WebElement selectCountry;
	@FindBy(css = "a[class*='action__submit']")
	WebElement submit;
	By result = By.cssSelector(".form-group .ta-results");
	
	public void selectCountry(String countryName) {		
		Actions ac = new Actions(driver);
		ac.sendKeys(country, countryName).build().perform();		
		waitForElementToAppear(result);
		selectCountry.click();
		
	}
	public confarmationPage submitTheOrder() {
		submit.click();
		return new confarmationPage (driver);
	}

}
