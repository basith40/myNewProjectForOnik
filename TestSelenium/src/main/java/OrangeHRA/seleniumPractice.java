package OrangeHRA;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumPractice {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
	    driver = new ChromeDriver();
		driver.get("https://www.paypal.com/us/home");
		WebElement login = driver.findElement(By.xpath("//*[@id='ul-btn']"));
		login.click();
		signin("basith", "*[type='submit']", "34256","*[name='btnLogin']");
		
//		driver.findElement(By.xpath("//*[@id='ul-btn']")).click();
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("basith");
//		driver.findElement(By.xpath("//*[@type='submit']")).click();
//		driver.findElement(By.xpath("//*[@name='login_password']")).sendKeys("1234ng");
		File exileFile = new File("https://d.docs.live.net/7fd8293e07c47c26/Documents/Basith");
		FileInputStream stream = new FileInputStream(exileFile);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String teString = sheet.getRow(2).getCell(3).getStringCellValue();
		System.out.println(teString);

	}
	
//	public static final String LOCATION = "//Users/chowdhury//Downloads//chromedriver";
//	public static String java(String left) throws IOException {
//		File file = new File(LOCATION);
//		FileInputStream stream = new FileInputStream(file);
//		Properties properties = new Properties();
//		properties.load(stream);
//		return properties.getProperty(left);
//	}
	public static void signin(String id,String next, String password, String click) throws Exception {
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.cssSelector("*[id='email']"));
		username.sendKeys(id);
		Thread.sleep(1000);
		WebElement nextElement = driver.findElement(By.cssSelector(next));
		nextElement.click();
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.cssSelector("*[name='login_password']"));
		pass.sendKeys(password);
		Thread.sleep(1000);
		WebElement sig = driver.findElement(By.cssSelector(click));
		sig.click();
	}
//	public static final String PATHFILE = "/Users/chowdhury/eclipse-workspace/TestSelenium/src/main/java/OrangeHRA/seleniumPractice.java";
//	public static String test1(String value) throws IOException {
//		File myFile = new File(PATHFILE);
//		FileInputStream stream = new FileInputStream(myFile);
//		Properties testProperties = new Properties();
//		testProperties.load(stream);
//		return testProperties.getProperty(value);
//	}

}
