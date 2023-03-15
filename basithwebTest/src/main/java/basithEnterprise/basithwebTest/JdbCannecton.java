package basithEnterprise.basithwebTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.regexp.recompile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JdbCannecton {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
		
		Connection sql = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/record_company", "root", "Maisha2015!");
        Statement s = sql.createStatement();
        ResultSet rs = s.executeQuery("select * from albums where id = 8");
        rs.next();
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.findElement(By.id("txtUsername")).sendKeys(rs.getString("name"));
        driver.findElement(By.id("txtPassword")).sendKeys(rs.getString("release_year"));
        System.out.println(rs.getString("name"));
        System.out.println(rs.getString("release_year"));
	}

}
