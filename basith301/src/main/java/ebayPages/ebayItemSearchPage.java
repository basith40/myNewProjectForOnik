package ebayPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ebayResorces.ebayPageBase;

public class ebayItemSearchPage extends ebayPageBase{
	
	private By search = By.xpath("//*[@name='_nkw']");
	private By clickSearchButton = By.cssSelector("#gh-btn");
    private By fistSelecetedItem = By.xpath("//*[@class='srp-results srp-list clearfix']/li[1]/div/div/a");
    
	public ebayItemSearchPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement itemSearch() {
		return driver.findElement(search);
	}
	public WebElement searchButton() {
		return driver.findElement(clickSearchButton);
	}
	public WebElement firstItem() {
		return driver.findElement(fistSelecetedItem);
	}
	

}
