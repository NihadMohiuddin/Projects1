package Libraries;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import Base.BaseClass;

public class LoginPage extends BaseClass {

	
	@FindBy(xpath="//span[normalize-space()='Account & Lists']")
	WebElement Accounts_element;
	
	
	@FindBy(xpath ="//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']")
	WebElement signin_element;
	
	@FindBy(id="ap_email")
	WebElement MailidTxt_element;
	
	
	@FindBy(id="continue")
	WebElement continue_element;
	
	
	
	@FindBy(id="ap_password")
	WebElement PasswordTxt_element;
	
	
	@FindBy(id="signInSubmit")
	WebElement SignBtn_element;
	
	
	
	/*
	@FindBy(id="ap_password")
	WebElement PasswordTxt_element;
	
	
	@FindBy(id="ap_password")
	WebElement PasswordTxt_element;
	
	@FindBy(id="ap_password")
	WebElement PasswordTxt_element;
	
	*/
	String mailid=pr.getProperty("Email");
	String Pass=pr.getProperty("Password");
	
	
    Actions act=new Actions(driver);

    public void login() throws InterruptedException
	{
		
	    act.moveToElement(Accounts_element).perform();
		signin_element.click();
		
		MailidTxt_element.sendKeys(mailid);
		continue_element.click();
		PasswordTxt_element.sendKeys(Pass);
		SignBtn_element.click();

	}
	
	
	
	
	
	
	
	
	
	
	
}
