package bdTech.E2EProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class DragWindows {
	@Test
	public void drop() {
		System.setProperty("webdriver.chrome.driver", "/Users/chowdhury/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement myFram = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(myFram);
		Actions actions = new Actions(driver);
		WebElement surc = driver.findElement(By.id("draggable"));
		WebElement terget = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(surc, terget).build().perform();
	}

}
