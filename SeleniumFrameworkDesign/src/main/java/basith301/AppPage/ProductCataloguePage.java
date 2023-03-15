package basith301.AppPage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basith301.AbstractComponents.AbstractComponents;

public class ProductCataloguePage extends AbstractComponents {
	WebDriver driver;

	public ProductCataloguePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}

	@FindBy(css = ".row .mb-3")
	List<WebElement> items;
	@FindBy(css = ".ng-animating")
	WebElement spinner;
	

	By productBy = By.cssSelector(".row .mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By tostMessage = By.cssSelector(".overlay-container");

	public List<WebElement> getProductList() {
		waitForElementToAppear(productBy);
		return items;
	}

	public WebElement getProductByName(String productName) {
		WebElement myItem = getProductList().stream()
				.filter(item -> item.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst()
				.orElse(null);
		return myItem;

	}

	public void addProductToCart(String productName) throws InterruptedException {
		WebElement myItem = getProductByName(productName);
		myItem.findElement(addToCart).click();
		waitForElementToAppear(tostMessage);
		waitForElementToDisappear(spinner);
	}
	

}
