
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSeleniumTest {
	

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		WebElement userid = driver.findElement(By.id("txtUsername"));
		userid.sendKeys("admin");
		Thread.sleep(3000);
		
		WebElement passward = driver.findElement(By.id("txtPassword"));
		passward.sendKeys("admin123");
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		
		WebElement profile = driver.findElement(By.linkText("Welcome David"));
		if (profile.getText().contains("Welcome")) {
			System.out.println("Its logedin");
		}
		else {
			System.out.println("Its unable to log in");
		}
//		String str = profile.getText();
//		System.out.println(str);
				

	}

}
