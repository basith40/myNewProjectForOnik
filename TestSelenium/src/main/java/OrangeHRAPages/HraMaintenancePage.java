package OrangeHRAPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HraMaintenancePage extends PageBasse{

	public HraMaintenancePage(WebDriver driver) {
		super(driver);
		
	}
	WebElement maintenance = driver.findElement(By.id("menu_maintenance_purgeEmployee"));
	public void maintenance() throws Exception {
		Thread.sleep(1000);
		maintenance.click();
	}

}
