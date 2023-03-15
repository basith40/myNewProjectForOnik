package shopping;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ItemsSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.wegmans.com");
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.findElement(By.xpath("//a[text()='Bakery']")).click();
		//driver.findElement(By.cssSelector("#nav-menu-toggle")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 3);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".icon-delete")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".icon-delete")).click();
		driver.findElement(By.cssSelector("a[title='Breakfast']")).click();
		driver.findElement(By.cssSelector("img[id='xClose']")).click();
		//String [] itemsNedded = {"Chocolate Chip","Everything Bagels","Blueberry","Apple Fritter"};		
		List<WebElement> items = driver.findElements(By.cssSelector(".css-yxhcyb"));
		for(int i = 0; i < items.size(); i++) {
			String itemsName = items.get(i).getText();
			
			//List<String> myItems = Arrays.asList(itemsNedded);
			if(itemsName.contains("Bulk Muffins")) {				
				driver.findElements(By.cssSelector(".css-yxhcyb")).get(i).click();
				break;				
			}
		}
		driver.findElement(By.xpath("//span[text()='Add to List']")).click();
		driver.findElement(By.cssSelector("button[data-test='modal-close-button']")).click();
		driver.quit();

	}

}
