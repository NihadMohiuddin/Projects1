package com.ReactShoppingCart.Baseclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.ReactShoppingCart.Utils.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	
	public WebDriver driver;
	public ReadConfig readconfig=new ReadConfig();
	
	
	
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException 
	{
		
		String Browsername=	readconfig.getbrowsername();
		String Url=	readconfig.getUrl();
		
		
		
		switch (Browsername)
		{
		
		
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;

     
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		
       
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		
		   }
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(Url);
			
		
		
		}
		
	
	
	//@AfterMethod
	public void Teardown() 
	{
		driver.quit();

	}

	
	
	
	
	
	
}
