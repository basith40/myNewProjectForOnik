package swagLabsmirorPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import swagLabsAbstractData.SwagLabsAbstractPage;

public class SwagLabsCheckoutPage extends SwagLabsAbstractPage {
	WebDriver driver;

	public SwagLabsCheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = "//div[@class='summary_info'] /div[2]")
	private WebElement price;
	@FindBy(css = "#finish")
	private WebElement finishButton;

	public String productPrice() {
		String productPrice = price.getText();
		return productPrice;
	}

	public void shoppingFinish() {
		finishButton.click();
		

	}

}
