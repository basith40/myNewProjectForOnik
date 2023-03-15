package saucedemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeTest extends BaseSaucedemo{
	@Parameters({"URL"})
	@Test(groups= {"try"})
	public void myTest(String url) {
		System.out.println("myTest");
		driver.get(url);
	}
	@Test
	public void drinksCoke() {
		System.out.println("coke");
	}
	@Test(dependsOnMethods= {"drinksCoke"})
	public void drinksPepsi() {
		System.out.println("pepsi");
	}
	@Test(groups= {"try"})
	public void drinksFanta() {
		System.out.println("fanta");
	}

}
