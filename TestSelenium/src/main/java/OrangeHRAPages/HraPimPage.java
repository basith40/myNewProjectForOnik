package OrangeHRAPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HraPimPage extends PageBasse{

	public HraPimPage(WebDriver driver) {
		super(driver);
		
	}
	WebElement pimElement = driver.findElement(By.id("menu_pim_viewPimModule"));
	public void pimSelect() {
		pimElement.click();
	}

}
