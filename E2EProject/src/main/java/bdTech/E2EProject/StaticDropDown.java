package bdTech.E2EProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.united.com/en/us");
		driver.findElement(By.cssSelector("#passengerSelector")).click();
		Thread.sleep(2000);
		for (int i = 1; i < 6; i++) {
			driver.findElement(By.xpath("//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[1]/div/button[2]")).click();
			
			
		}
		
		

	}
	//*[@id="passengerMenuId"]/div[1]/div[1]/div[1]/div/button[2]

}
