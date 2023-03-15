package EmiratesPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmiratesLandingPage extends EmiratesPageBase {

	public EmiratesLandingPage(WebDriver driver) {
		super(driver);

	}

	public void emiratesHomePage() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
		WebElement destinationCity = driver.findElement(By.name("Arrival Airport"));
		destinationCity.sendKeys("dhaka");
		

		List<WebElement> country = driver.findElements(By.xpath(
				"//section[@class='location.global'] //div[@class='dropdown__link.js-select-body.js-location-link']"));

		for (WebElement myCountry : country) {
			if (myCountry.getText().equalsIgnoreCase("Dhaka")) {

				myCountry.click();
				break;

			}
		}
	}

}
