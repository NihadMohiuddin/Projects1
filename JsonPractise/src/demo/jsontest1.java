package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class jsontest1 {

	
	
	@Test 
	private void m1() throws IOException, ParseException
	{
		String path=System.getProperty("user.dir")+ "\\src\\demo\\demo1.json";
		JSONParser par=new JSONParser();
		FileReader read=new FileReader(path);
		Object ob=par.parse(read);
		JSONObject obj=(JSONObject)ob;
		JSONObject compnyli=(JSONObject) obj.get("Company List");
	  
		String x=(String) compnyli.get("Compnay1");
		String y=(String) compnyli.get("Compnay3");
		
		System.out.println(x +"  " +  y);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
