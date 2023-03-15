package swagLabsmirorPages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import swagLabsAbstractData.SwagLabsAbstractPage;

public class SwagLabsProductCataloughePage extends SwagLabsAbstractPage{
	WebDriver driver;
	public SwagLabsProductCataloughePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".inventory_item")
	List<WebElement> products;
	
	private By productBy = By.cssSelector(".inventory_item");
	private By addToCart = By.cssSelector(".pricebar button");
	
	public List<WebElement> getProdectList() {
		waitForElementToAppear(productBy);
		return products;
	}
	
	public WebElement getProductName(String productName) {
		WebElement prod = getProdectList().stream().filter(product -> product.findElement
				(By.cssSelector(".inventory_item_name")).getText().contains(productName)).findFirst().orElse(null);
		return prod;
	}
	
	public void addProductToCart(String productName) {
		WebElement prod = getProductName(productName);
		prod.findElement(addToCart).click(); 
	}

}
