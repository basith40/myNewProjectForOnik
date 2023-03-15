package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdtuch.EProject.PageBase;

public class AdminHomePage extends PageBase{

	public AdminHomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(tagName = "a")
	WebElement tag;
	
	public WebElement pageLinks() {
		
		return tag;
	}
	

}
