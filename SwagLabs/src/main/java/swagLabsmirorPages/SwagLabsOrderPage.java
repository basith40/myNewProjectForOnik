package swagLabsmirorPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swagLabsAbstractData.SwagLabsAbstractPage;

public class SwagLabsOrderPage extends SwagLabsAbstractPage{
	WebDriver driver;
	public SwagLabsOrderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(css = ".inventory_item_name")
	List<WebElement>productNames;
		
	public Boolean verifyOrderDisplay(String productName) {
		boolean match = productNames.stream().anyMatch(cartproduct->cartproduct
				.getText().contains(productName));
		return match;
	}
	

}
