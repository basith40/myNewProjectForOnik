package Usps;
import org.testng.annotations.Test;

import USPSBase.UspsBase;
import USPSPages.UserNamePage;
import USPSPages.UspsloginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class uspsTest extends UspsBase{
	@Test
	public void login() throws Exception {
//		UspsloginPage usps = new UspsloginPage(driver);
//		usps.sing();
		
		
		UserNamePage usps1 = new UserNamePage(driver);
		usps1.login1();
		
	}
	
	
	//@Test
	
//	public void myTest() throws Exception {
//		signin("login-register-header");
//		login("Basith01", "Shammi198","btn-submit");
//		recovery("style-guide");
//		email("basith30@yahoo.com", "btn-submit");
//
//
//	}//@Test
//	public void myTest2() throws Exception {
//		
//		search("//*[@id=\"g-navigation\"]/div/nav/ul/li[1]/a[2]", "//*[@id=\"g-navigation\"]/div/nav/ul/li[1]/div/ul/li[3]/a");
//	}


}
