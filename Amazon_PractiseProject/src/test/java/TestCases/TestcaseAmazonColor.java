package TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Base.BaseClass;



public class TestcaseAmazonColor extends BaseClass {

	@Test
	public void checkingcoloryeloowPresentornot() 
	{
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");		
            driver.findElement(By.id("nav-search-submit-button")).click(); //searcg btn

	          String prentwin=driver.getWindowHandle();
	
            driver.findElement(By.xpath("//img[@alt=\"Sponsored Ad - Apple iPhone 14 Pro 128GB Space Black\"]")).click();
	    //after click abpve will opens new window
            Set<String> allwind=driver.getWindowHandles();
         
       
	   List<String> window=new ArrayList<String>(allwind);
	
	      
	       driver.switchTo().window( window.get(1));
	

	         System.out.println(driver.getTitle());
	 
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	
	  List<WebElement> imgelmetns=	driver.findElements(By.xpath("//div[@id='inline-twister-expander-content-color_name']//li[contains(@data-asin,\"B0BD\")]//img"));
	
	  
	  System.out.println("size of elemnts "+imgelmetns.size());
	
	
	  
	  boolean flag=false;
	  for (int i = 0; i < imgelmetns.size(); i++)
	  {
		
		String colortext=  imgelmetns.get(i).getAttribute("alt");
		  
		  System.out.println(colortext);
		  System.out.println();
		  
		  if (colortext.equalsIgnoreCase("Yellow")) 
		  {
			
			flag=true;
			break;
		  }
		  else
		  {
			  flag=false;
		   }
	
	  
	  
	  }
	  
	  
	  if (flag) 
	  {
		  System.out.println("Yellow color is present ");
	  } 
	  else
	  {
		  System.out.println("Yellow color is NOT present ");
	  }
	  
	  
	WebElement colordynamictext=  driver.findElement(By.xpath("//span[@class=\"a-size-base a-color-secondary\"]/following-sibling::span[@id=\"inline-twister-expanded-dimension-text-color_name\"]"));
	
	System.out.println(colordynamictext.getText());
	  
	  
	  
	  
	  
	  
	 
	
	}
	
	
	
	
	
	
	
	
	
	
	
}

