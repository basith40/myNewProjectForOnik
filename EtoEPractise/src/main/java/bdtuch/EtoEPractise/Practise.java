package bdtuch.EtoEPractise;

import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement stDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(stDropdown);
		Thread.sleep(3000);
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		for(int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(3000);		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='CCU']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("us");
		List<WebElement> suggestive = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement auto: suggestive) {
			if(auto.getText().equalsIgnoreCase("Austria")) {
				auto.click();
			}
		}
		
		
		driver.findElement(By.cssSelector("*[for*='StudentDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("*[for*='StudentDiscount']")).isSelected());
		Assert.assertEquals(driver.findElements(By.cssSelector("*[type='checkbox']")).size(), 6);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(3000);
		driver.quit();
	

	}

}
