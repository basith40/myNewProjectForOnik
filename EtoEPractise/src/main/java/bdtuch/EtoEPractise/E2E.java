package bdtuch.EtoEPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class E2E {

	public static void main(String[] args) throws InterruptedException {
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
		to.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		WebElement passengerSelect = driver.findElement(By.id("divpaxinfo"));
		passengerSelect.click();
		int i = 1;
		while(i<5) {
		WebElement adult = driver.findElement(By.id("hrefIncAdt"));
		adult.click();
		i++;
		}
		WebElement doneBotton = driver.findElement(By.id("btnclosepaxoption"));
		doneBotton.click();
		Thread.sleep(3000);
		WebElement stDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(stDropdown);
		dropdown.selectByValue("USD");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
