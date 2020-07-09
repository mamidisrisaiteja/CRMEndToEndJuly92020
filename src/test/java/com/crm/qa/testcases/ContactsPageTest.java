package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;

	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		
		loginPage=new LoginPage();
		homePage =loginPage.loginTheUser(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(3000);
		contactsPage=homePage.clickOnContactsLink();
		
		
	}
	
	@Test(priority=1)
	public void validateContactsPageTitle() {
		
		String title=contactsPage.getContactsPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	@DataProvider
	public Object[][] getContactsData() {
		Object data[][]=TestUtil.getExcelData("Sheet1");
		return data;
	}
	
	@Test(priority=2,dataProvider="getContactsData")
	public void createNewContact(String firstName,String lastName,String email) throws Exception {
		contactsPage.createNewContact(firstName, lastName, email);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
