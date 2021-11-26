package com.switchcaseusingbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchConUsingWebBrowsers {
	
	
	public static void main(String[] args) {
		
		String browser="opera";
		final WebDriver driver;
		
		switch(browser) {
			
		case "chrome":
			
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 String url="https://www.makemytrip.com/";
			 driver.get(url);
			 
			 System.out.println("open google chrome");
			 break;
			
		case "firefox":
			
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			
			String url1="https://www.irctc.co.in";
			driver.get(url1);
			 
			System.out.println("open firefox driver");
			break;
		
		case "edge":
			
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			
			String url2="https://www.myntra.com/";
			driver.get(url2);
			
			
			System.out.println("open edge driver");
			break;
			
		case "opera":
			
			WebDriverManager.operadriver().setup();
			driver=new OperaDriver();
			
			String url3="https://www.zomato.com/hyderabad";
			driver.get(url3);
			System.out.println("open opera driver");
			break;
			
		default:
			System.out.println("Google chrome browser");
			
		}
		
	}

}
