package mixedConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LivedemoStream {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users/chowdhury//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> vagiName = driver.findElements(By.xpath("//tr/td[1]"));
		List<String>originalVagiName = vagiName.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>newVagiName = originalVagiName.stream().sorted().collect(Collectors.toList());
		//newVagiName.stream().forEach(s->System.out.println(s));
		Assert.assertTrue(originalVagiName.equals(newVagiName));
		List<String> myVagi;
		do{
			List<WebElement> vagiRows = driver.findElements(By.xpath("//tr/td[1]"));
		myVagi = vagiRows.stream().filter(s->s.getText().contains("Strawberry"))
				.map(s->getItemPrice(s)).collect(Collectors.toList());
		myVagi.forEach(a->System.out.println(a));
		if(myVagi.size()<1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}
		while(myVagi.size()<1);
		
	}

	private static String getItemPrice(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
