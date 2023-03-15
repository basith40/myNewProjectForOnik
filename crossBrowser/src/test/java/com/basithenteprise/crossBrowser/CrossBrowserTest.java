package com.basithenteprise.crossBrowser;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	@Test
	public void crossBrowser() throws MalformedURLException {
		MutableCapabilities capabilities = new MutableCapabilities();
				
		WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.booking.com/");
		driver.getTitle();
	}

}
