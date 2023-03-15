package Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UspsLoginPage {
	public static final String FILEPATH = "/Users/chowdhury/eclipse-workspace/TestSelenium/src/main/java/Utilities/TestUtilities.properties";
	public static String get(String key) throws IOException {
		File myFile = new File(FILEPATH);
		FileInputStream myStream = new FileInputStream(myFile);
		Properties myprop = new Properties();
		myprop.load(myStream);
		return myprop.getProperty(key);
	}

}
