package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]/a[1]")
	WebElement contactsActivity;
	
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsPage;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public ContactsPage clickOnContactsLink() {
		contactsPage.click();
		
		return new ContactsPage();
		
	}
	
   

}
