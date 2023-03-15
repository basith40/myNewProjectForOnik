package alertsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HttpsCeertificateHandiling {

	public static void main(String[] args) {
		DesiredCapabilities dc = DesiredCapabilities.htmlUnit();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dc.acceptInsecureCerts();
		ChromeOptions co = new ChromeOptions();
		co.merge(dc);
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
