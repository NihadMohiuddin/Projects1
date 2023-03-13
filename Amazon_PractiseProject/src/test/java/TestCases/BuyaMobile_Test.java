package TestCases;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseClass;
import Libraries.LoginPage;
import Libraries.MobilePage;


public class BuyaMobile_Test extends BaseClass {

	
	
	
	
	//@Test
	public  void  CheckMobilePurchase() throws InterruptedException {   
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		lp.login();
		
		
		MobilePage mp=	PageFactory.initElements(driver,MobilePage.class);
        mp.BuyMobile("samsung", 1);
        mp.Addtocart_Placeorder();
		
		
		
		
		
    
    
    }	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
