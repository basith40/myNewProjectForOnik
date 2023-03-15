package OrangeHRA;

import org.testng.annotations.Test;

import OrangeHRABase.BaseClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseClass{
	public Test1() {
		super();
	}
    @Test
	public void firstTest() throws Exception {
		login("admin", "admin123", "btnLogin");
		String profileName = "Welcome Paul";
		WebElement profileid = driver.findElement(By.id("welcome"));
		String actul = profileid.getText();
		AssertJUnit.assertEquals(actul, profileName);
		//timeing("menu_time_viewTimeModule", "menu_attendance_Attendance");
		

	}
    @Test
	
    public void secondTest() throws Exception {
    	login("Admin", "admin321", "btnLogin");
    	String errorms = "Invalid credentials";
    	WebElement errorelment = driver.findElement(By.xpath("//*[@id=\'spanMessage\']"));
    	String act = errorelment.getText();
    	AssertJUnit.assertEquals(act, errorms);		
    }
    @Test
    public void thirdTest() throws Exception {
    	login("Admin", "", "btnLogin");
    	String errormg = "Password cannot be empty";
    	WebElement errElement = driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));
    	String actu = errElement.getText();
    	AssertJUnit.assertEquals(actu, errormg);
    }
    @Test
    public void forthTest() throws Exception {
    	login("", "admin123", "btnLogin");
    	String errmsg = "Username cannot be empty";
    	WebElement erroElement = driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));
    	String actul = erroElement.getText();
    	AssertJUnit.assertEquals(actul, errmsg);
    	
    }
    
    
  
}
