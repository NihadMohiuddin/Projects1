package Base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static String filepath=System.getProperty("user.dir") +"\\ConfigFolder\\ConfigFile";
	
	public static FileReader fr;
	public static Properties pr=new Properties();
	
	
	public static WebDriver driver;
  
	
  @BeforeTest
	public static void Setup() throws IOException 
	{
	   
	      fr=new FileReader(filepath);
		  pr.load(fr);
		  
		String browsername= pr.getProperty("Browser");
	    String URL        = pr.getProperty("URL")   ;              
		switch (browsername.toLowerCase() )
		{
		case "chrome" :
			
			//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(URL);
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(URL);
			break;
				
		
		
		
		}
		
		
		
		
		
			   
			   
	
		
		
		
		
		
		
		
		
		
		
		
	
   
	}
	
	




	public static void TearDown() 
	{
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
}
