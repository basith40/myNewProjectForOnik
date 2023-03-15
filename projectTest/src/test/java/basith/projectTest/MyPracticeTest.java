package basith.projectTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import myApplication.MyApplicationPage1;

public class MyPracticeTest extends MyPracticeBase{
	
	@Test
	public void testOne() {
		MyApplicationPage1 my1 = new MyApplicationPage1(driver);
		my1.categori().click();
		
	}

}
