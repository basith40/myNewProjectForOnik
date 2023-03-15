package OrangeHRAPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HraDirectoryPage extends PageBasse{

	public HraDirectoryPage(WebDriver driver) {
		super(driver);
		
	}
	WebElement directory = driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b"));
	public void directory() {
		directory.click();
	}

}
