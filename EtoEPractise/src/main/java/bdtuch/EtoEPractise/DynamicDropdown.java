package bdtuch.EtoEPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement dyDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		dyDropdown.click();
		WebElement from = driver.findElement(By.xpath("//a[@value='CCU']"));
		from.click();
		WebElement to = driver.findElement(By.xpath("(//a[@value='DEL'])[2]"));
		//Prents child relashionship Xpath
		//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']
		to.click();
		

	}

}
