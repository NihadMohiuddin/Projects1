import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
nnn
public class sample1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		
		
		driver.get("https://www.foundit.in/seeker/registration"); 
		Thread.sleep(2000);
		
		String path="C:\\Users\\Ya Rahman\\OneDrive\\Desktop\\New folder\\New folder\\Nihad_CV.docx";
		
		//driver.findElement(By.id("file-upload")).sendKeys(path);for uplolaodin using senkeys method
		
		
		driver.findElement(By.xpath("//span[text()='Choose CV']")).click();
		
	//to copy  path in system clipboard 
		StringSelection ss=new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
	   //Thread.sleep(2000);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_V);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
