package OrangeHRA;

import java.security.PublicKey;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import OrangeHRABase.BaseClass;
import OrangeHRAPages.HraDirectoryPage;
import OrangeHRAPages.HraMaintenancePage;
import OrangeHRAPages.HraPimPage;
import OrangeHRAPages.HraSearchDirectryPage;
import OrangeHRAPages.HraVerifyPage;
import OrangeHRAPages.hrmLoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MyTest extends BaseClass{
	
	@Test
	public void testHraLoginPage() throws Exception {
		hrmLoginPage testHrmLoginPage = new hrmLoginPage(driver);
		testHrmLoginPage.login();
	}	
	@Test
	public void testMaintenancePage() throws Exception {
		hrmLoginPage testHrmLoginPage = new hrmLoginPage(driver);
		testHrmLoginPage.login();
		HraMaintenancePage testHraMaintenancePage = new HraMaintenancePage(driver);
		testHraMaintenancePage.maintenance();
		HraVerifyPage testHraVerifyPage = new HraVerifyPage(driver);
		testHraVerifyPage.verifyMain();
	}

	@Test
	public void testDirectoryPage() throws Exception {
		hrmLoginPage testHrmLoginPage = new hrmLoginPage(driver);
		testHrmLoginPage.login();
		HraDirectoryPage testDirectoryPage = new HraDirectoryPage(driver);
		testDirectoryPage.directory();
		HraSearchDirectryPage testSearchDirectryPage = new HraSearchDirectryPage(driver);
		testSearchDirectryPage.nameSearch();
	}
	
	
	@Test
	public void testHraPimPage() throws Exception {
		hrmLoginPage testHrmLoginPage = new hrmLoginPage(driver);
		testHrmLoginPage.login();
		HraPimPage testHraPimPage = new HraPimPage(driver);
		testHraPimPage.pimSelect();
	}
	
		
	}


