import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.grammarly.com/plagiarism-checker");
	
		String path="C:\\Users\\Ya Rahman\\OneDrive\\Desktop\\Practise\\Exceptions & It's Solutions\\New Text Document.txt";
		
		
		
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		WebElement button=	driver.findElement(By.xpath("//form[@id=\"file-upload-form\"]//button"));
		Thread.sleep(2000);
		
		button.click();
		
	  
		//copied to clipboard
		StringSelection ss=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(2000);
	
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_V);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		
	
	Thread.sleep(2000);
	WebElement textarea=driver.findElement(By.xpath("//textarea[@class=\"_3CFUF-el\"]"));		

		
	act.keyDown(textarea, Keys.CONTROL).sendKeys("a").build().perform();
		
		
		
		
		
	}
	}
