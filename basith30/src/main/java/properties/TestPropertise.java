package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPropertise {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/properties/data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("systemproperties"));
		System.out.println(prop.getProperty("webdriver"));
		System.out.println(prop.getProperty("url"));

	}

}
