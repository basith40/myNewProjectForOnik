package arifProjecttest;

import org.testng.annotations.Test;

import arifProject.AddItemsIncartPage;
import arifProject.ArifBase;
import arifProject.ItemSortingPage;
import arifProject.LoginPage;

public class ArifProjectTest extends ArifBase{
	@Test
	public void saucedemoLogin() throws InterruptedException {
		LoginPage lpage = new LoginPage(driver);
		lpage.login();
		ItemSortingPage iSorting = new ItemSortingPage(driver);	
		iSorting.sortItems();
		AddItemsIncartPage cart = new AddItemsIncartPage(driver);
		cart.cart();
	}
	@Test
	public void sort() throws InterruptedException {
		saucedemoLogin();
		Thread.sleep(2000);
		ItemSortingPage iSorting = new ItemSortingPage(driver);	
		Thread.sleep(2000);
		iSorting.sortItems();
	}
	@Test
	public void addtocart() throws InterruptedException {
		saucedemoLogin();		
		AddItemsIncartPage cart = new AddItemsIncartPage(driver);
		cart.cart();
		
	}

}
