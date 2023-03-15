package bdtuch.basith30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.united.com/en/us");
		driver.findElement(By.xpath("//div[@id='bookFlightTab-panel']/form/div/fieldset/div/label[2]")).click();
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		while (!driver
				.findElement(
						By.xpath("//div[contains(@class,'CalendarMonthGrid__horizontal_2')]/div[3]/div/div/strong[1]"))
				.getText().contains("December 2021")) {
			driver.findElement(By.cssSelector(".app-containers-BookCalendar-bookCalendar__nextIcon--Codc_")).click();
		}

		Thread.sleep(2000);
		List<WebElement> days = driver.findElements(By.xpath("//td[@aria-disabled='false']"));
		days.size();

		for (int i = 0; i < days.size(); i++) {
			String dates = driver.findElements(By.xpath("//td[@aria-disabled='false']")).get(i).getText();
			if (dates.equalsIgnoreCase("23")) {
				driver.findElements(By.xpath("//td[@aria-disabled='false']")).get(i).click();
				break;
			}
		}

	}

}
