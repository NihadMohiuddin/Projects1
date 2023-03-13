package Libraries;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Base.BaseClass;

public class MobilePage extends BaseClass {

	
	@FindBy(id="nav-hamburger-menu")
	WebElement AllCatg_element;
	
	@FindBy(xpath="//div[normalize-space()='Mobiles, Computers']")
	WebElement Mobi_comp_element;

	
	@FindBy(linkText ="All Mobile Phones")
	WebElement Allmobiles_element;
	
	@FindBy(xpath="//*[@id=\"s-refinements\"]/div[5]/ul/li")
	WebElement   Brands_Webelemnts_element;
	
	
	
	
	@FindBy(id="buy-now-button")
	WebElement buynowbutton_element;
	
	
	
	@FindBy(xpath ="//h1[contains(text(),' Checkout')]")
	WebElement checkoutMSG_element;
	
	
	Actions act=new Actions(driver);
	public void BuyMobile(String MobileBrand, int Selct_Index) throws InterruptedException
	{
		AllCatg_element.click();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		Mobi_comp_element.click();
		Thread.sleep(3000);
		Allmobiles_element.click();
		
		Thread.sleep(2000);
		String actualtitle=driver.getTitle();
		String Exptitle="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		assertEquals(actualtitle, Exptitle);//asserts
		
		
        act.sendKeys(Keys.PAGE_DOWN).perform();
         
       //for handling all check boxes of brands and selecting one
 List<WebElement> allbrands=  driver.findElements(By.xpath("//*[@id=\"s-refinements\"]/div[5]/ul/li//following::span[@dir='auto' and  @class=\"a-size-base a-color-base\"]"));
		//for printing all text
		for(int i=0;i<=6;i++)
                {
			      String txt= allbrands.get(i).getText();
			          System.out.println(txt);
			    
                }
		//clicks on selected brand
		try {
		    for(int j=0;j<=6;j++) 
		        {
		    	      String txt2=allbrands.get(j).getText();
			         
		    	      if(txt2.equalsIgnoreCase(MobileBrand))
			        {
			    	   allbrands.get(j).click();
			           
			        }
		        }
		    
		}
		    
		    catch (Exception e) 
			{
				
			}
 
		    List<WebElement>  pics = driver.findElements(By.xpath("//div[contains(@data-asin,'B0')]")) ; 
			         
           pics.get(Selct_Index).click();
			          
			          
	
 
	}
	//after click opens new window so window handles
	public void Addtocart_Placeorder() 
	{
		
		String parentwindow=driver.getWindowHandle();
		Set<String> windows=	driver.getWindowHandles();

		Iterator<String> itr=windows.iterator();
		
		while (itr.hasNext()) 
		  {
			    
			    driver.switchTo().window(itr.next());
		  }
		
		
		buynowbutton_element.click();
		
		
		
		if (checkoutMSG_element.isDisplayed()) 
		{
			System.out.println("Item Added to cart PASSED");
			assertTrue(true);
		} 
		else 
		{
			System.out.println("Item Added to cart FAILED");
			assertFalse(false);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
