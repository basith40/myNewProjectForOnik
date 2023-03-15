package bdtuch.arif;

import org.testng.annotations.Test;

import utility.Base;

public class PageTest extends Base {
	@Test
	public void items() throws InterruptedException {
		driver.get(properties.getProperty("url"));
		AmazonHatSearchingPage aPage = new AmazonHatSearchingPage(driver);
		aPage.itemsearch.sendKeys("hats for men");
		aPage.search.click();
		aPage.hatsSelect().click();
		Thread.sleep(3000);
		AddingHatsinCartPage hPage = new AddingHatsinCartPage(driver);
		Thread.sleep(3000);
		hPage.itemQuantity().click();
		Thread.sleep(2000);
		hPage.iQuantity();

//		CartHomePage cPage = new CartHomePage(driver);
//		cPage.itemsAssert().click();

	}

}
