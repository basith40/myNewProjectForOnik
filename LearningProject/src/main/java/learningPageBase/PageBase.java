package learningPageBase;

import org.openqa.selenium.WebDriver;
import learningBase.Base;

public class PageBase extends Base{
	WebDriver driver;
	public PageBase(WebDriver driver) {
		this.driver = driver;
	}
}
