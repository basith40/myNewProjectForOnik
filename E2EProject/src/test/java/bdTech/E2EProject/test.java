package bdTech.E2EProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {
	WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/chowdhury/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("iframe")).get(2));
		System.out.println(driver.findElements(By.tagName("iframe")).size());
//		driver.get("https://jqueryui.com/droppable/");
//		WebElement myframe = driver.findElement(By.cssSelector("iframe.demo-frame"));
//		driver.switchTo().frame(myframe);
//		Actions ac = new Actions(driver);
//		WebElement onest = driver.findElement(By.id("draggable"));
//		WebElement twond = driver.findElement(By.id("droppable"));
//		ac.dragAndDrop(onest, twond).build().perform();
		
//		driver.get("https://the-internet.herokuapp.com/windows");
//		driver.findElement(By.linkText("Click Here")).click();
//		Set<String> window = driver.getWindowHandles();
//		Iterator<String>myWindow = window.iterator();
//		String original = myWindow.next();
//		String sub = myWindow.next();		
//		driver.switchTo().window(sub);
//		driver.switchTo().window(original);
//		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
//		driver.switchTo().window(sub);
//		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
//		
		
		
//		WebElement footerlink = driver.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[3]"));
//		System.out.println(footerlink.findElements(By.tagName("a")).size());
//		for (int i = 1; i < footerlink.findElements(By.tagName("a")).size(); i++) {
//			String linkClicking = Keys.chord(Keys.COMMAND,Keys.RETURN);
//			footerlink.findElements(By.tagName("a")).get(i).sendKeys(linkClicking);
//	}
	}
}
