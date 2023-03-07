package bdTech.Maven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.makemytrip.com/?ccde=us");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		  driver.findElement(By.xpath("//span[text()='From']")).click();
		  Thread.sleep(2000);
		  WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		  Thread.sleep(2000);
		  from.sendKeys("sydney");		  
		  Thread.sleep(2000);
		  from.sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(2000);
		  from.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  rahul();

	}
	public static void rahul() {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.findElement(By.id("autosuggest")).sendKeys("ban");
		  List<WebElement>country = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		  for (WebElement mycountry : country) {
			  if (mycountry.getText().equalsIgnoreCase("bangladesh")) {
				mycountry.click();
			}
			
		}
		
	}

}
