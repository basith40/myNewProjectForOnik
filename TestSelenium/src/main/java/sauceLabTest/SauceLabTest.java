package sauceLabTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabTest {
	public static final String USERNAME = "oauth-basith401-640b8";
	public static final String ACCESS_KEY = "1259ec4b-cc07-4dd7-bd75-7cfa67fb046d";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");		
		//URL url = new URL("https://ondemand.us-west-1.saucelabs.com/wd/hub");
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
