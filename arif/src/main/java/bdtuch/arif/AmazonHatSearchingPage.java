package bdtuch.arif;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageBase;

public class AmazonHatSearchingPage extends PageBase {

	public AmazonHatSearchingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement itemsearch;
	@FindBy(id = "nav-search-submit-button")
	WebElement search;
	@FindBy(css = "img[alt=\\\"Carhartt Men's Knit Cuffed Beanie\\\"]")
	WebElement firstHat;

	public WebElement myItem() {
		return itemsearch;
	}

	public WebElement searchButton() {
		return search;
	}

	public WebElement hatsSelect() {
		return firstHat;
	}

}
