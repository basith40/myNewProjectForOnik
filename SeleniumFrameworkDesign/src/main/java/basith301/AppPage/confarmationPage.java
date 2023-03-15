package basith301.AppPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basith301.AbstractComponents.AbstractComponents;

public class confarmationPage extends AbstractComponents{
	WebDriver driver;

	public confarmationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css = ".hero-primary")
	WebElement confarmationMessage;
	
	public String myconfarmationMessage() {
		return confarmationMessage.getText();
	}

}
