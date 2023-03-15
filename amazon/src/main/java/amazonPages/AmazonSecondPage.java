package amazonPages;

import amazonAbstractComponents.AmazonSuperBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonSecondPage extends AmazonSuperBasePage {
    public AmazonSecondPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".s-widget-container .a-section.a-spacing-base")
    List<WebElement>items;
    public void itemsList(){
        WebElement myItem = items.stream().filter(item->item.findElement(By.cssSelector(".s-title-instructions-style"))
              .getText().contains("Rice White Thai Jasmine Organic")).findFirst().orElse(null);
        myItem.findElement(By.cssSelector(".s-title-instructions-style")).click();
    }

}

