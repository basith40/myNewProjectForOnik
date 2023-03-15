package bdTech.Emirates;

import org.testng.annotations.Test;

import EmiratesPages.EmiratesLandingPage;

public class EmiratesPageTest extends EmiratesBase{
	@Test
	public void landingPage() throws InterruptedException {
	EmiratesLandingPage landingPage = new EmiratesLandingPage(driver);
	landingPage.emiratesHomePage();
		
	}
}
