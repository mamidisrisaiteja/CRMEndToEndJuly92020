package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement creatingNewContact;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	
	
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement emaiId;
	
//	@FindBy(xpath="//input[@placeholder='Email address']")
//	WebElement company;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveBtn;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getContactsPageTitle() {
		
		
		return driver.getTitle();
	}
	
	public void createNewContact(String firstNameV,String lastNameV,String emailIdV) throws Exception {
		Thread.sleep(2000);
		creatingNewContact.click();
		Thread.sleep(2000);
		firstName.sendKeys(firstNameV);
		Thread.sleep(2000);
		lastName.sendKeys(lastNameV);
		Thread.sleep(2000);
		emaiId.sendKeys(emailIdV);
		Thread.sleep(2000);
		saveBtn.click();
		Thread.sleep(2000);
	}
	
	
	

}
