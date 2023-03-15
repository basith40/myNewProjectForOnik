package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHendle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotels.com/de1506246/hotels-new-york-new-york/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("._1yFrqc._1ZtnNu")).click();
		List<WebElement>dates = driver.findElements(By.xpath("//div[@class='_2U8Hy7']/table/tbody/tr/td"));
		
		for(int i = 0; i<dates.size(); i++) {
			String taxt = driver.findElements(By.xpath("//div[@class='_2U8Hy7']/table/tbody/tr/td")).get(i).getText();
			if(taxt.equalsIgnoreCase("30")) {
				driver.findElements(By.xpath("//div[@class='_2U8Hy7']/table/tbody/tr/td")).get(i).click();
			}
		}
//		while(!driver.findElement(By.xpath("//ul[@class='_1wuKFQ _1e9UGk']/li[2]/div/h2")).getText().contains("January 2022")){
//			driver.findElement(By.xpath("//div[@class='_3a2zGh']/div/button[2]")).click();
//		}

	}

}
