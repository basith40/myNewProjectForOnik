package ebayTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import ebayPages.ebayItemSearchPage;
import ebayResorces.ebayBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ebayPageTest extends ebayBase{
	@Test
	public void ebaySearchTest() {
		ebayItemSearchPage ebayitem = new ebayItemSearchPage(driver);
		ebayitem.itemSearch().sendKeys("playstation 5");
		ebayitem.searchButton().click();
		ebayitem.firstItem().click();
		
		
	}

}
