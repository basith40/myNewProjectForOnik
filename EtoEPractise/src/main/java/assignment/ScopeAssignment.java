package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScopeAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("checkBoxOption2")).click();
		String setext = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(setext);
		WebElement element = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(element);
		select.selectByVisibleText(setext);
		driver.findElement(By.id("name")).sendKeys(setext);
		driver.findElement(By.id("alertbtn")).click();
		String alart = driver.switchTo().alert().getText();
		
		if(alart.contains(setext)) {
			System.out.println("my alart message is "+alart);
		}
		else {
			System.out.println("i dont get my page");
		}
		driver.quit();
		//List<WebElement> name = driver.findElements(By.tagName("label"));
		
		
			
		

	}

}
