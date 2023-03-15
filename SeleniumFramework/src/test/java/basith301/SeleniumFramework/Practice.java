package basith301.SeleniumFramework;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Practice {
	@Test

	public void bedssl() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
//		ChromeOptions co = new ChromeOptions();
//		co.setAcceptInsecureCerts(true);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.174:4444"), caps);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://expired.badssl.com");
		System.out.println(	driver.getTitle());
		driver.close();
		

	}

}
