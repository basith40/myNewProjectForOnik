package ebayTest;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ebayPages.ebayItemSearchPage;
import ebayResorces.ebayBase;

public class ebayPageTest1 extends ebayBase{
	//@Test
	public void ebaySearchTest() {
		ebayItemSearchPage ebayitem = new ebayItemSearchPage(driver);
		ebayitem.itemSearch().sendKeys("playstation 5");
		ebayitem.searchButton().click();
	}

}
