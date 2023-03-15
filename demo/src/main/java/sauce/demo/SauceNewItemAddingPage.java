package sauce.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.SaucePageBase;

public class SauceNewItemAddingPage extends SaucePageBase{

	public SauceNewItemAddingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[text()='Sauce Labs Onesie']")
	WebElement addItem;
	@FindBy(css = "#add-to-cart-sauce-labs-onesie")
	WebElement addToCart;
	@FindBy(css = ".shopping_cart_link")
	WebElement cartHome;
	
	
	public WebElement addAItem() {
		return addItem;
	}
	public WebElement clickForCart() {
		return addToCart;
	}
	public WebElement cart() {
		return cartHome;
	}
		
	
	

}
