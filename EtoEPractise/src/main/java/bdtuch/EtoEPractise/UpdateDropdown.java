package bdtuch.EtoEPractise;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
		passengerSelect.click();
		Assert.assertEquals(passengerSelect.getText(), "5 Adult");
		WebElement radioBotton = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		radioBotton.click();
		driver.findElement(By.cssSelector(".picker-second")).getAttribute("style");
		System.out.println(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style"));
		if(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style").contains("1")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
