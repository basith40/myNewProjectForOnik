package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("autosuggest")).sendKeys("us");
		Thread.sleep(2000);
		List<WebElement>cuntry = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(WebElement myCuntry : cuntry) {
			if(myCuntry.getText().equalsIgnoreCase("Austria")) {
				myCuntry.click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[value='BOM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='CCU']) [2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		WebElement passenger = driver.findElement(By.id("hrefIncAdt"));
		for(int i = 1; i < 5; i++) {
			passenger.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select myCurrency = new Select(currency);
		Thread.sleep(2000);
		myCurrency.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		driver.quit();
		
		

	}

}
