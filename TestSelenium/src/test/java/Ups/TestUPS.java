package Ups;

import org.testng.annotations.Test;

import UPSBase.BaseUPS;
import UPSPages.SiginPage;
import UPSPages.UpsloginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestUPS extends BaseUPS{
	@Test
	public void Upslogin() throws Exception {
		UpsloginPage testPage1 = new UpsloginPage(driver);
		testPage1.log();
		SiginPage testPage2 = new SiginPage(driver);
		testPage2.sigin();
	}

	
	

}
