package amazonPageTest;

import amazonAbstractComponents.AmazonBasePage;
import amazonPages.AmazonFirstPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class AmazonpagesTest  extends AmazonBasePage {
    @Test
    public void loginPageTest(){
        AmazonFirstPages pages = new AmazonFirstPages(driver);
        pages.scerchbar();
        pages.scerchItems();






    }
}
