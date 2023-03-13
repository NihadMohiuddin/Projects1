package com.ReactShoppingCart.TestCases;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ReactShoppingCart.Baseclass.Baseclass;
import com.ReactShoppingCart.Pageobjects.Homepage;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class HomePageTest  extends Baseclass{

	
	public Homepage homepage;
	
	/*
	@Test(priority = 2)
	  public void VerifyProductsAvailableMessageTest() throws InterruptedException
      {
		
		homepage=new Homepage(driver);		
		boolean res=homepage.CaptureCountnandMSg();
		assertTrue(res);
		
      }
	*/
	
	
	
	@Test(priority = 1)
	public void VerifyProductisAddedtoCartTest() throws InterruptedException
	{
		homepage=new Homepage(driver);		
	homepage.AddProductstoCart(driver);
		
	
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
