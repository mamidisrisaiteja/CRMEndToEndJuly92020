package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()   {
		try {
		prop =new Properties();
		FileInputStream fip=new FileInputStream("C:\\Users\\saitejamamidi\\eclipse-workspace\\CRM_POM_ENDTOEND_27Jun2020\\src\\main\\java\\com\\crm\\qa\\config\\config.properities");// it reads the java files
		prop.load(fip);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\saitejamamidi\\\\Desktop\\\\Sai Teja\\\\Automation\\\\Selenium Practice\\\\SW\\\\geckodriver-v0.24.0-win64\\\\geckodriver.exe");
		
		   driver=new FirefoxDriver();
		   
		// we have to launch any browsers (chrome, firefox etc)
			
			// we have to use the driver object for various operaions
			// driver is the reference of WebDriver interface which has only methods with signatures only
			
		driver.get(prop.getProperty("url"));
	}
	

}
