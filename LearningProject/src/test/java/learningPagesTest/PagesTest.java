package learningPagesTest;

import org.testng.annotations.Test;
import learningBase.Base;
import learningPages.LandingPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PagesTest extends Base{
	
	@Test
	public void testpage(){
		LandingPage lg = new LandingPage(driver);
		lg.login();
		
	}
  
}
