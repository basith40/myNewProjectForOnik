package sauce.demo;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.SaucePageBase;

public class SauceItemsSortingPage extends SaucePageBase{
	public WebDriver driver;
	@FindBy(css = ".select_container")
	WebElement containerSelect;
	@FindBy(css = "[value='lohi']")
	WebElement priceLowtoHigh;
	
	public SauceItemsSortingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement container() {
		return containerSelect;
	}
	public WebElement price() {
		return priceLowtoHigh;
	}
	
	
}
