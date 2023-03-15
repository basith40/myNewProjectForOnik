package OrangeHRA;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Chowdhury.ExcelData;

import OrangeHRAPages.hrmLoginPage;

public class TestArrays{
	
	@Test
	public void allAdmin() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.usps.com");
		driver.findElement(By.xpath("//*[@id=\"g-navigation\"]/div/nav/ul/li[8]/a[2]")).click();
		driver.findElement(By.id("global-header--search-track-search")).sendKeys("FREE BOXES");
		List<WebElement> boxs = driver.findElements(By.cssSelector("a[role='menuitem'] a"));
		for (WebElement search : boxs) {
			if (search.getText().equalsIgnoreCase("FREE BOXES")) {
				search.click();
				break;
			}
		}
	}

	//@Test
	public void acctionTest() {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Actions test = new Actions(driver);
		WebElement search = driver.findElement(By.id("nav-link-accountList"));
		test.moveToElement(search).build().perform();
		test.moveToElement(driver.findElement(By.cssSelector("*[type='text']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("televition").doubleClick().build().perform();

	}

	//@Test
	public void scope() {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement subElement = driver.findElement(By.id("navFooter"));
		System.out.println(subElement.findElements(By.tagName("a")).size());
	}
	//@Test
	public void hra() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		File eFile = new File("//Users/chowdhury//Downloads//Book1.xlsx");
		FileInputStream stream = new FileInputStream(eFile);
		XSSFWorkbook workBook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workBook.getSheetAt(0);
		String website = sheet.getRow(1).getCell(4).getStringCellValue();
		String userName = sheet.getRow(2).getCell(4).getStringCellValue();
		String password = sheet.getRow(3).getCell(4).getStringCellValue();
		driver.get(website);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		workBook.close();
		driver.quit();
	}
	
	  
	

}
