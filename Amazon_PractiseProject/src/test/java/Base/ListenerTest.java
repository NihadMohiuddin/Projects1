package Base;


import org.testng.ITestListener;
import org.testng.TestListenerAdapter;

import org.testng.annotations.Test;

public class ListenerTest implements ITestListener
 {
            public  void parentmethod()
           {

             System.out.println("parent   method");
           }

	
	

 }
 
 
 
class child  extends parent
  {

	
	public void m1() {
		 parentmethod();

	}
    	 
    	
    	
    		

        

  






	@Test
      public static void main()
      { 
    	  child c=new child();
    	  c.childmethod();
		
	  }
  
  
  }    
      
    

