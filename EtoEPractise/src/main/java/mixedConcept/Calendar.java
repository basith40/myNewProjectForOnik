package mixedConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "/Users/chowdhury/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/button[1]")).click();
		String month = "December 2021";
		String day   = "24";
		driver.findElement(By.cssSelector("#checkin")).click();
		
		while(true) {                         
		String text = driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/thead/tr[1]/th[2]")).getText();
		if(text.equals(month)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[3]/i[1]")).click();
		}
		}
		driver.findElement(By.xpath("//div[9]//div[1]//table[1]//tbody[1]//tr//td[contains(text(),"+day+")]")).click();
	}

} 

