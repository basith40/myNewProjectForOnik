import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
//import org.openqa.selenium.devtools.

import com.google.common.collect.ImmutableList;

public class BlockNetworkRequests {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// log file ->
		DevTools devTools = ((HasDevTools) driver).getDevTools();
		devTools.createSession();
		devTools.send(org.openqa.selenium.devtools.v108.network.Network.enable(Optional.empty(), Optional.empty(),
				Optional.empty()));
		devTools.send(
				org.openqa.selenium.devtools.v108.network.Network.setBlockedURLs(ImmutableList.of("*.jpg", "*.css")));
		long startTime = System.currentTimeMillis();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Browse Products")).click();
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		// 1793 2033

	}

}
