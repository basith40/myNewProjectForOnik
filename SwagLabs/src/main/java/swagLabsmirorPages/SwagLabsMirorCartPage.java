package swagLabsmirorPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swagLabsAbstractData.SwagLabsAbstractPage;

public class SwagLabsMirorCartPage extends SwagLabsAbstractPage{
	WebDriver driver;

	public SwagLabsMirorCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(css = ".inventory_item_name")
	List<WebElement>cartProducts;
	@FindBy(css = "#checkout")
	private WebElement checkout;
	
	public Boolean verifyProductDisplay(String productName) {
		boolean match = cartProducts.stream().anyMatch(cartproduct->cartproduct
				.getText().contains(productName));
		return match;
	}
	
	public SwagLabsCheckoutInfoPage goToCheckout() {
		checkout.click();
		return new SwagLabsCheckoutInfoPage(driver);
	
	}
	
	
	

}
