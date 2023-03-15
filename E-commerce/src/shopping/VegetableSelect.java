package shopping;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VegetableSelect {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.wegmans.com");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/basith301/Downloads/src.png"));
		driver.findElement(By.id("cookie_action_close_header")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2200)");
//		driver.findElement(By.xpath("(//div[contains(@class,'weg-contentgrid-block weg-contentgrid-block-hover')])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".icon-delete")).click();

		// driver.quit();
	}

}
