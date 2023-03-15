package OrangeHRAPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HraSearchDirectryPage extends PageBasse{

	public HraSearchDirectryPage(WebDriver driver) {
		super(driver);
		
	}
	WebElement search = driver.findElement(By.cssSelector("*[type='text']"));
	WebElement searchclick = driver.findElement(By.cssSelector("*[id='searchBtn']"));
	public void search() {
		search.sendKeys("David Morris");
	}
	public void click() {
		searchclick.click();
	}
	public void nameSearch() {
		search();
		click();
	}

}
