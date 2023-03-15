package basith301.AppPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basith301.AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents {
	WebDriver driver;
	
	@FindBy(css = ".cartSection h3")
	List<WebElement> cartProducts;
	
	@FindBy(css = "ul[style*='none'] .btn.btn-primary")
	WebElement checkout;

	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyProductDisplay(String productName) {
		Boolean mach = cartProducts.stream().anyMatch(product -> product.getText().equalsIgnoreCase(productName));
		return mach;

	}

	public CheckoutPage goToCheckout() {
		checkout.click();
		return new CheckoutPage(driver);

	}

}
