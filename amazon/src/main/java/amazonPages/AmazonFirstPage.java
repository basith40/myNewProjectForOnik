package amazonPages;

import amazonAbstractComponents.AmazonSuperBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonFirstPage extends AmazonSuperBasePage {

    public AmazonFirstPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }
   
    @FindBy(id = "twotabsearchtextbox")
    WebElement scerch;
    @FindBy(id = "nav-search-submit-button")
    WebElement scerchButton;
    public void searchBar(){
        scerch.sendKeys("rice");
    }
    public void scerchItems(){
        scerchButton.click();

    }

}
