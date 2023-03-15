package uberPages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uberAbstract.Abstracts;

public class cookisAndLinkPage extends Abstracts {
	WebDriver driver;

	public cookisAndLinkPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[text()='Got it']")
	WebElement closeCookis;
	@FindBy(xpath = "//span[text()='Eat']")
	WebElement uberEat;
	@FindBy(css = "a[text='Order now']")
	WebElement order;
	@FindBy(css = "ul li.css-bjyRXz")
	List<WebElement> headerManu;
	


	public void cookis() {
		closeCookis.click();
	}

	public void program() {
		uberEat.click();
	}

	public void foodOrder() {
		order.click();
	}

	public void manu() {
		WebElement myManu = headerManu.stream()
				.filter(items -> items.findElement(By.xpath("//button[text()='Company']")).getText().equals("Company"))
				.findFirst().orElse(null);
		myManu.findElement(By.xpath("//button[text()='Company']")).click();

	}

}
