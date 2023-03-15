package PageObjests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	By deshboardTitle = By.xpath("//*[text()='Dashboard']");
	By manuBar = By.id("mainMenuFirstLevelUnorderedList");

	
	
	
	public WebElement getdTitle() {
		return driver.findElement(deshboardTitle);
	} 
	public WebElement manu() {
		return driver.findElement(manuBar);
	}

	
	

}
