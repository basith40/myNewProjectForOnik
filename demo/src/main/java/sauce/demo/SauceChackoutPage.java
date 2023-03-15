package sauce.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.SaucePageBase;

public class SauceChackoutPage extends SaucePageBase{

	public SauceChackoutPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#checkout")
	WebElement checkout;
	
	public WebElement itemsChackout() {
		return checkout;
	}

}
