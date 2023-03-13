package com.ReactShoppingCart.Pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	
	WebDriver driver;
	
	
	
	@FindBy(css =".checkmark" )
	private List<WebElement> AllSizes ;	
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/main/main/main" )
	private WebElement ProductsAvlMsg ;	
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/main/main/div/div" )
	private List<WebElement> Producstlist ;	
	
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/main/main/div//button" )
	private List<WebElement> AddtoCartBtn ;	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/main/div//button/parent::*/div[@alt]")
	private List<WebElement> ElementTextinHomepage;
	
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/button")
	private WebElement ClosebtnofCart;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]//p[@class=\"sc-11uohgb-2 elbkhN\"]")
	private List<WebElement> ElementTextinCart;
	
	
	/* XS  1 PRODUCT
	 * S   2 PRODUCT
	 * M   1 PRODUCT
	 * ML  2 PRODUCT
	 * L   10 PRODUCT
	 * XL  10 PRODUCT
	 * XXL 4 PRODUCT TOTAL 30
	  
	 */
	
	
	
	public Homepage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	           public int getProductsAvlMsg() 
	           {
	        	   String x=ProductsAvlMsg.getText();
	        	   String updated= x.replaceAll("[^0-9]", "");
	        	   
	        	   int i= Integer.parseInt(updated);
	        	   return  i;
		   	   }
	
	
	           
	           
	           public int getAllProductsCountofSpeecificSize()
	           {
	        	     
			     int countofproducts= Producstlist.size();
			  
			     return countofproducts; 
			  	   
			 }
	
	
	           public boolean CaptureCountnandMSg() throws InterruptedException 
	           {
	        	   boolean flag=false;
	        	   for (int j = 0; j < AllSizes.size(); j++) 
	        	   {  
	        		   AllSizes.get(j).click();
	        		   Thread.sleep(2000);
	        		   int msg= getProductsAvlMsg();
	        		   System.out.println("Msg of "+AllSizes.get(j).getText()+" is "+msg);
	        		   int count=getAllProductsCountofSpeecificSize();
	        		   System.out.println("Countof " +AllSizes.get(j).getText()+" is "+count);
	        		   if (msg==count)
	        		   {
	        			   flag= true;
					    }
	        		   
	        		   else 
	        		   {
	        			   flag= false;
	        			   System.out.println("Msg Not matching at size "+ AllSizes.get(j).getText());
	        			   break;//stop if not matching
					   }
	        	   
	        		      AllSizes.get(j).click();//to disable the same size btn
	        	          Thread.sleep(1000);
	        	   }
				      return flag;
   
	        	   
		     	}
	
	           
	           
	          
	        	
/* text of products
* Cropped Stay Groovy off white
Basic Cactus White T-shirt
Skater Black Sweatshirt
Black Tule Oversized
Black Batman T-shirt
Blue T-Shirt
Loose Black T-shirt
Ringer Hall Pass
Grey T-shirt
Black T-shirt with white stripes
	        		 */
	        	  
	           
		          public void AddProductstoCart(WebDriver driver) throws InterruptedException
		           {
		        	
		        	
	        	  
	        	  ArrayList<String> textofproductsadded=new  ArrayList<String>();
	        	  ArrayList<String> textofproductsinCart=new  ArrayList<String>();
	        	
	        	  //loop for sizesbtns
	        	  for (int i = 0; i <AllSizes.size(); i++) 
	        	 {
	        		     AllSizes.get(i).click();//click on size btn
	        		     Thread.sleep(1000);
	        		     System.out.println("No of Products in size "+  AllSizes.get(i).getText()+" are "+AddtoCartBtn.size());
	        		
	        		     //loop for addtocart
	        		     for (int j = 0; j < AddtoCartBtn.size(); j++) 
	        		   {
	        			   textofproductsadded.add(getTextofProducts(j));
		        	         AddtoCartBtn.get(j).click();
		        	      	 Thread.sleep(1000);
		        		     textofproductsinCart.add(getTextofProductsinCArt(j));
		        	    	ClosebtnofCart.click();
		        		     Thread.sleep(1000);
		        		    
	        		   }
	        		    
	        		     AllSizes.get(i).click();
	        		     Thread.sleep(1000);
        		   
	        		     
	        		     
	        		     
	        	 }
	        	 
	        	 
	        	 
	        	System.out.println("textofproductsadded are :");
	        	System.out.println(textofproductsadded);
	        	
	        	System.out.println("textofproductsinCart are :");
	        	System.out.println(textofproductsinCart);
	        	
	        	if (textofproductsadded.containsAll(textofproductsinCart)) 
	        	 {
					System.out.println("all products added");
				 } 
	        	 else 
	        	 {
	        		 System.out.println("Not added");
				}
	        	 
	        	 
	           
	           }
	        	  
	        	 
	          
	          
	        
	           
	           
	           
	           	           
	           
	           
	           
	          public String getTextofProducts(int i) 
	          {
				
	        	 String x= ElementTextinHomepage.get(i).getAttribute("alt");
			     return x;
	          
	          }
	           
	           
	
	          public String getTextofProductsinCArt(int i) 
	          {
				
	        	 String x= ElementTextinCart.get(i).getText();
			     return x;
	          
	          }
	          
	          
	          
	          
	          
	          
	          
}
