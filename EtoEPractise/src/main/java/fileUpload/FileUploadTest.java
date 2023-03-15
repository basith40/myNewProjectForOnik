package fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/chowdhury/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.linkText("Choose File")).click();
		Screen screen = new Screen();
		Pattern fileInputTextBox = new Pattern();

	}

}
