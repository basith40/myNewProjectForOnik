package miscellaneous;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MysqlData {

	public static void main(String[] args) throws SQLException {
		// jdbc:mysql://"+localhost+":"+3306+"/basith_enterprise";

		String host = "localhost";
		String port = "3306";

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/sql_Store", "root",
				"Shammi1982!");
		Statement stat = connect.createStatement();
		ResultSet result = stat.executeQuery("select * from customers where customer_id = 6;");

		while (result.next()) {
			driver.findElement(By.cssSelector("#email")).sendKeys(result.getString("first_name"));
			driver.findElement(By.cssSelector("#pass")).sendKeys(result.getString("city"));

		}
		
	}
}
