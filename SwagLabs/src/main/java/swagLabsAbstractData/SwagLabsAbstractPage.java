package swagLabsAbstractData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import swagLabsmirorPages.SwagLabsMirorCartPage;
import swagLabsmirorPages.SwagLabsOrderPage;

public class SwagLabsAbstractPage {
	WebDriver driver;

	public SwagLabsAbstractPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".shopping_cart_link")
	WebElement cartHeader;

	@FindBy(css = ".primary_header #shopping_cart_container")
	WebElement orderHeader;

	public void waitForElementToAppear(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}

	public void waitForElementToDisappear(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
	}
	public SwagLabsMirorCartPage goToTheCartPage() {
		cartHeader.click();
		SwagLabsMirorCartPage cartPage = new SwagLabsMirorCartPage(driver);
		return cartPage;
	}	
	public SwagLabsOrderPage goToTheOrderPage() {
		orderHeader.click();
		SwagLabsOrderPage orderPage = new SwagLabsOrderPage(driver);
		return orderPage;
	}
	

}
