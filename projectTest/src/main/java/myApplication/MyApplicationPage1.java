package myApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MyApplicationPage1 {
	public WebDriver driver;
	By clickCategories = By.xpath("//div[@id='header']/nav/a[3]");

	public MyApplicationPage1(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement categori() {
		return driver.findElement(clickCategories);
	}

}
