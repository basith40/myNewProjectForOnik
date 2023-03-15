package uberPagesTest;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import uberAbstract.Base;
import uberPages.OrderPage;
import uberPages.cookisAndLinkPage;

public class PageTest extends Base {
	WebDriverWait wait;
	@Test
	public void testDriver() throws IOException {
		
		cookisAndLinkPage uberCandL = new cookisAndLinkPage(driver);
		uberCandL.cookis();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Company']")));
		uberCandL.manu();
		uberCandL.program();
		uberCandL.foodOrder();

	}

	@Test
	public void foodOrderPage() throws IOException {
		testDriver();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentUrl = it.next();
		String childUrl = it.next();
		driver.switchTo().window(childUrl);
		OrderPage oPage = new OrderPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Got it']")));
		oPage.accept();
		driver.switchTo().window(parentUrl);
		oPage.countrySelect();
		oPage.enterAddress();
	}

}
