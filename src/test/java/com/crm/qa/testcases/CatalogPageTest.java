/*
 * @author Naveen Khunteta
 * 
 */

package com.crm.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CatalogPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ShoppingCart;
import com.crm.qa.util.TestUtil;

public class CatalogPageTest extends TestBase{
/*
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	CatalogPage catalogPage;
	ShoppingCart shoppingcartpage;
	String sheetName = "contacts";
	
	   
	public CatalogPageTest(){
			super();
			
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException, MalformedURLException {
		
		initialization();
		testUtil = new TestUtil();
		catalogPage = new CatalogPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//testUtil.switchToFrame();
		catalogPage = homePage.clickOnDressLink();
	}
	
	@Test(priority=1)
	public void verifyCatalogPageLabel(){
	Assert.assertEquals(catalogPage.verifyCatalogLabel(),"Casual Dresses - My Store", "Catalog page title not matched");
	}
	
	@Test(priority=2)
	public void verifyCatalogPageTest() throws InterruptedException{
		shoppingcartpage = catalogPage.ShoppingCartLink();
	}
	
		@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
	*/
}
