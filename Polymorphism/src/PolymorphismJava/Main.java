package PolymorphismJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		MixtAnimal ny = new MixtAnimal();
		Bird myBird = new Bird();
		Cat mCat = new Cat();
		Cow mCow = new Cow();
		ny.mixtSound(mCow);
		ny.mixtSound(mCat);
		ny.mixtSound(myBird);
		
		
		
		
		
		
		
		
		
		
		
		/*System.setProperty("webdriver.chrome.driver", "//Users//chowdhury//Downloads//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.close();
		/*driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("basith301@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("3823Maisha!");
		driver.findElement(By.name("login")).click();*/
		/*driver.get("http://login.yahoo.com");
		driver.findElement(By.name("username")).sendKeys("basith301@yahoo.com");
		driver.findElement(By.name("signin")).click();*/
		

}
}