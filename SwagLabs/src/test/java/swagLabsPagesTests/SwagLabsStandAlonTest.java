package swagLabsPagesTests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SwagLabsStandAlonTest {

	public static void main(String[] args) {
		String productName = "Onesie";
		// invoke browser.
		WebDriver driver = new FirefoxDriver();
		// lunch website.
		driver.get("https://www.saucedemo.com/");
		// maximize browser.
		driver.manage().window().maximize();
		// wait for browser responce.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// login to the website. LandingPage 1
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".inventory_item")));
		
		
		// find my selected product; ProductCataloughePage 2
		List<WebElement> products = driver.findElements(By.cssSelector(".inventory_item"));
		WebElement prod = products.stream().filter(
				product -> product.findElement(By.cssSelector(".inventory_item_name")).getText().contains(productName))
				.findFirst().orElse(null);
		prod.findElement(By.cssSelector(".pricebar button")).click();
		// wait until page is lowded.
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		
		
		// go to cartpage. AbstractPages.3
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		
		
		
		// is prodductname eqeal in cartproduct;  OrderPage.4
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".inventory_item_name"));
		boolean match = cartProducts.stream().anyMatch(cartproduct -> cartproduct.getText().contains(productName));
		Assert.assertTrue(match);
		
		
		// chack out.   ChackoutInfoPage .5
		driver.findElement(By.cssSelector("#checkout")).click();
		driver.findElement(By.cssSelector("#first-name")).sendKeys("Maisha");
		driver.findElement(By.cssSelector("#last-name")).sendKeys("Chowdhury");
		driver.findElement(By.cssSelector("#postal-code")).sendKeys("11209");
		driver.findElement(By.cssSelector("#continue")).click();
		
		
		
          // Payment information.    CheckoutPage. 6
		String paymentInfo = driver.findElement(By.xpath("//div[@class='summary_info'] /div[2]")).getText();
		System.out.println(paymentInfo);
		driver.findElement(By.cssSelector("#finish")).click();
		
          //Thankyou message.  OrderCompletedPage. 7
		String thankyouMessage = driver.findElement(By.cssSelector(".complete-header")).getText();
		System.out.println(thankyouMessage);
		Assert.assertEquals(thankyouMessage, "Thank you for your order!");
		driver.close();

	}

}
