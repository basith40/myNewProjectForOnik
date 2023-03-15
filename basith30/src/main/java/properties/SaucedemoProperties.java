package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SaucedemoProperties {
	public void myProperties() throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/properties/data.properties");
	prop.load(fis);
	prop.getProperty("systemproperties");
	prop.getProperty("webdriver");
	prop.getProperty("url");
	
	}
}
