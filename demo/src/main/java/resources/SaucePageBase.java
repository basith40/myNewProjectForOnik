package resources;

import org.openqa.selenium.WebDriver;

public class SaucePageBase extends SauceBase{
	WebDriver driver;
	public SaucePageBase(WebDriver driver) {
		this.driver = driver;
	}

}
