package dropDown;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		WebElement dropdown =  driver.findElement(By.cssSelector("select.nav-search-dropdown"));
		Select sDropdown = new Select(dropdown);
		sDropdown.selectByIndex(4);
		System.out.println( sDropdown.getFirstSelectedOption().getText());
		sDropdown.selectByVisibleText("  Men");
		System.out.println( sDropdown.getFirstSelectedOption().getText());
		sDropdown.selectByValue("search-alias=magazines");
		System.out.println( sDropdown.getFirstSelectedOption().getText());

	}

}
