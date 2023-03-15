package swagLabsmirorPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swagLabsAbstractData.SwagLabsAbstractPage;

public class SwagLabsLandingPage extends SwagLabsAbstractPage {
	WebDriver driver;

	public SwagLabsLandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#user-name")
	private WebElement userName;
	@FindBy(css = "#password")
	private WebElement userPassword;
	@FindBy(css = "#login-button")
	private WebElement login;
	@FindBy(css = "[data-test='error']")
	private WebElement errorMessage;

	public SwagLabsProductCataloughePage loginpage(String name, String pass) {
		userName.sendKeys(name);
		userPassword.sendKeys(pass);
		login.click();
		SwagLabsProductCataloughePage sCataloughePage =  new SwagLabsProductCataloughePage(driver);
		return sCataloughePage;

	}
	public String eMessage() {
		String loginError = errorMessage.getText();
		return loginError;
	}

}
