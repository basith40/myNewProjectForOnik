package mixedConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor  jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		jse.executeScript("document.querySelector('.tableFixHead').scrollTop=900");
		List<WebElement>sumNumber = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int add = 0;
		for(int i = 0; i<sumNumber.size(); i++) {
			add = add + (Integer.parseInt(sumNumber.get(i).getText()));
			
		}
		System.out.println(add);
		String text = driver.findElement(By.cssSelector(".totalAmount")).getText();
		int myTextSum = Integer.parseInt(text.split(":")[1].trim());
		Assert.assertEquals(add, myTextSum);

	}

}
