package sauce.demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import resources.SauceBase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceTest extends SauceBase{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test
	public void homePageTest() {
		SauceLoginPage slp = new SauceLoginPage(driver);
		slp.userName.sendKeys("standard_user");
		slp.uPassword.sendKeys("secret_sauce");
		slp.login.click();
		log.info("Sucsessfully login the store");
		SauceItemsSortingPage sisac = new SauceItemsSortingPage(driver);
		sisac.containerSelect.click();
		sisac.priceLowtoHigh.click();
		log.info("Successfully sorting items price low to high");
		SauceAddItemsToTheCartPage siac = new SauceAddItemsToTheCartPage(driver);
		siac.myCart();
		log.info("Successfully adding items in my cart");
		SauceShoppingCartHomePage ssch = new SauceShoppingCartHomePage(driver);
		ssch.itemsAsserting();
		log.info("Items is carrect in cart what  seleceted");
		SauceRemoveItemFromCartPage sric = new SauceRemoveItemFromCartPage(driver);
		sric.itemRemove();
		log.info("Successfully removed 1 item");
		SauceNewItemAddingPage snia = new SauceNewItemAddingPage(driver);
		snia.addToCart.click();
		snia.cartHome.click();
		log.info("successfully added 1 new item");
		SauceChackoutPage scp = new SauceChackoutPage(driver);
		scp.checkout.click();
		log.info("chackout page is displayed");
		ChackoutInformationPage ci = new ChackoutInformationPage(driver);
		ci.firstName().sendKeys("Abdul");
		ci.lastName().sendKeys("Chowdhury");
		ci.myZip().sendKeys("11208");
		ci.conButton().click();
		log.info("Successfully verified my chackout info");
		SauceChackoutAssertingPage scap = new SauceChackoutAssertingPage(driver);
		scap.itemsAsserting();
		scap.totalPriceAsseerting();
		log.info("Everythings looks good");
		
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		driver = getBrowser();
		log.info("Browser open Sauce Home page");
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
