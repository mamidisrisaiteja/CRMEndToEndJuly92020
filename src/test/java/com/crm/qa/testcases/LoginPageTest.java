package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	public  LoginPage loginPage;
	public HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		
		
	}
	
	@Test
	public void validateLoginPageTitle() {
		String title=loginPage.getLoginPageTitle();
		Assert.assertEquals(title,"Cogmento CRM");
	}
	@Test
	public void loginTest() {
		loginPage.loginTheUser(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	@AfterMethod
	public void endOfTheTest(){
		driver.quit();
	}

}
