package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		driver.findElement(By.cssSelector(".hm-icon")).click();
		driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']/li[3]/a")).click();
		
		int i = 1;
		while(i<5) {
			driver.get("https://www.amazon.com");
			i++;
		}

	}

}
