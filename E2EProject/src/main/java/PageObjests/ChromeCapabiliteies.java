package PageObjests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeCapabiliteies {

	public static void main(String[] args) {
		DesiredCapabilities dcCapabilities = DesiredCapabilities.chrome();
		//dcCapabilities.acceptInsecureCerts();
		dcCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dcCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.merge(dcCapabilities);
		WebDriver driver = new ChromeDriver(cOptions);

	}

}
