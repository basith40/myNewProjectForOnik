package miscellaneous;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	@Test
	public void getPageTitle() throws MalformedURLException {
		MutableCapabilities capabilities = new MutableCapabilities();
		
	
		WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),capabilities);
		driver.get("https://booking.com");
		Assert.assertEquals(driver.getTitle(), ""); 
	}

}
