package swagLabsmirorPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import swagLabsAbstractData.SwagLabsAbstractPage;

public class SwagLabsOrderCompletedPage extends SwagLabsAbstractPage {
	WebDriver driver;

	public SwagLabsOrderCompletedPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(css = ".complete-header")
	private WebElement yourMessage;

	public String completeMassege() {
		String thankyouMessage = yourMessage.getText();
		@SuppressWarnings("unused")
		SwagLabsCheckoutInfoPage sciPage = new SwagLabsCheckoutInfoPage(driver);
		return thankyouMessage;
	}

}
