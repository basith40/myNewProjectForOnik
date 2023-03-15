package swagLabsmirorPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import swagLabsAbstractData.SwagLabsAbstractPage;

public class SwagLabsCheckoutInfoPage extends SwagLabsAbstractPage {
	WebDriver driver;

	public SwagLabsCheckoutInfoPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(css = "#first-name")
	private WebElement firstName;
	@FindBy(css = "#last-name")
	private WebElement lastName;
	@FindBy(css = "#postal-code")
	private WebElement poCode;
	@FindBy(css = "#continue")
	private WebElement continu;

	public void checkoutInformation(String fName, String lName, String postCode) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		poCode.sendKeys(postCode);

	}

	public SwagLabsCheckoutPage submitOrder() {
		continu.click();
		SwagLabsCheckoutPage checkoutPage = new SwagLabsCheckoutPage(driver);
		return checkoutPage;

	}

}
