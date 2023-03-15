package basith301.AppPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basith301.AbstractComponents.AbstractComponents;
public class LandingPage extends AbstractComponents{
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}	
	@FindBy(css="#userEmail")
	WebElement userEmail;
	@FindBy(css="#userPassword")
	WebElement userPassword;
	@FindBy(css="#login")
	WebElement loginButton;
	
	public ProductCataloguePage webLogin(String email, String pass) {
		userEmail.sendKeys(email);
		userPassword.sendKeys(pass);
		loginButton.click();
		ProductCataloguePage pCatalog = new ProductCataloguePage(driver);
		return pCatalog;
	}
	public void loginError2(String email2,String password2 ) {
		userEmail.sendKeys(email2);
		userPassword.sendKeys(password2);
		loginButton.click();
	}
	

}
