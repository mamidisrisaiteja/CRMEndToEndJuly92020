package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="email")
	WebElement userid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public  HomePage loginTheUser(String un,String pwd) {
		userid.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	

}
