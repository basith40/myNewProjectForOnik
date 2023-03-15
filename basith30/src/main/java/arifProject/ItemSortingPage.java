package arifProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ItemSortingPage extends ArifPageBase{

	public ItemSortingPage(WebDriver driver) {
		super(driver);
	}
	public void sortItems() throws InterruptedException {
		Select itemSelect = new Select(driver.findElement(By.className("product_sort_container")));
		itemSelect.selectByIndex(2);
		Thread.sleep(2000);
	}

}