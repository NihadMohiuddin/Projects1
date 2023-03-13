package com.ReactShoppingCart.Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	private String filepath=System.getProperty("user.dir")+"\\COnfigFiles\\ConfigFile.file";
	
	private FileInputStream fi;
	private Properties  properties=new Properties();
	
	
	
	      public String getbrowsername() throws IOException 
         {
		    
	    	  
	    	  fi=new FileInputStream(filepath);
	    	  properties.load(fi);
	    	  return properties.getProperty("Browser");
         
         
         
         }
	
	
	        public String getUrl() throws IOException 
         {
	        	  fi=new FileInputStream(filepath);
		    	  properties.load(fi);
		    	  return properties.getProperty("Url");

		 }
	
	
	
	
	
}
