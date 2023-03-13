import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table
{

	

		public static void main(String[] args) throws InterruptedException
		
		
		{
			
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();	
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.nyse.com/ipo-center/recent-ipo"); 
	         Thread.sleep(4000);
			
		try {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();	//acceptcookies btn
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			
		
		WebElement table=driver.findElement(By.xpath("//h2[2]/following::table"));
	
		
			
		List<WebElement> rows=table.findElements(By.tagName("tr"));
			System.out.println("Total rows are "+rows.size());
			
			List<WebElement> Colum	=rows.get(1).findElements(By.tagName("td"));
			System.out.println("Total Colum are "+Colum.size());
			
			System.out.println();
			
			
			
			for (int i = 1; i < rows.size() ; i++) 
			{
				
				List<WebElement> colum=rows.get(i).findElements(By.tagName("td"));
				
				
				for (int j = 0; j <=1; j++)
				{
					
					 String textofeachtd=  colum.get(j).getText();
					
					
					 System.out.print(textofeachtd+"  ");
				}
					
				  
					
					
				
				
				
				
				System.out.println();

				System.out.println();
				
			}
			
			
			
			
	
	
}
	
	
	
}
	
	
	
	

