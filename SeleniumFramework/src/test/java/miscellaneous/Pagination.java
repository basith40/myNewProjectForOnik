package miscellaneous;

import java.net.MalformedURLException;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Pagination {
	@Test
	public void greenkartShopping() throws InterruptedException, MalformedURLException {
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setBrowserName("safari");
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.174:4444"), caps);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/greenkart/");
		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// capture all webelements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of all webelements into new(original) list
		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
		// sort on the original list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		// compare original list vs sorted list
		AssertJUnit.assertTrue(originalList.equals(sortedList));
		List<String> price;
		// scan the name column with getText ->Beans->print the price of the Rice
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1);
		driver.close();
	}
	

	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;

	}

}
