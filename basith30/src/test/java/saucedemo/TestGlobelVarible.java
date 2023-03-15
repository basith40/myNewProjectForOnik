package saucedemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestGlobelVarible {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("User.dir")+"/src/main/java/properties/data.properties");
		prop.load(fis);
		System.out.println(prop.get("url"));
		System.out.println(prop.get("browser"));
		prop.setProperty("browser","safari");
		System.out.println(prop.get("browser"));
		FileOutputStream fos = new FileOutputStream(System.getProperty("User.dir")+"/src/test/java/saucedemo/globle.properties");
        prop.store(fos, null);

	}

}
