package com.cssfbdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssFBLoginDemo {
	
static WebDriver driver;
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\javaExamples\\chromedriver_win32\\chromedriver.exe");  
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();  
	    
	    driver.get("https://www.fb.com");
	    
	    try {
	    	
	    	WebElement email_id=driver.findElement(By.id("email"));
	    	
	    	if(email_id.isDisplayed()) {
	    		email_id.sendKeys("Selenium");
	    		driver.close();
	    	}
	    
	    	
	    }catch(Exception e){
	    	System.out.println("Excepton s:" +e);
	    }
	    		 
	}
}



