package demo;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.json.Json;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import netscape.javascript.JSObject;

public class JsonTest {

	
	
	
	@Test (dataProvider ="ts")
	public  void m1(String data) throws IOException, ParseException
	
	{
             
             String d[]=data.split(",");
             System.out.println(d[0]);
             System.out.println(d[1]);
     		
		
		
		
		
	}
	
	@DataProvider(name="ts")
	public String[] dtp() throws IOException, ParseException
	{
		
		String path=System.getProperty("user.dir")+"\\src\\demo\\demo.json";
		JSONParser par=new JSONParser();
		FileReader reader=new FileReader(path);
		
		Object javaob=par.parse(reader);
		JSONObject jsonj=(JSONObject)javaob;
		JSONArray validinp=(JSONArray) jsonj.get("ValidInputs");
		
		String[] arry=new String [validinp.size()];
		
		
		
		for (int i=0;i < validinp.size();i++)
		{
			JSONObject obj=(JSONObject) validinp.get(i);
			String usrname=(String) obj.get("Username");
			String Pass=(String) obj.get("Password");
			//arrays starts from 0
			arry[i]=usrname+","+Pass;// stores as  nihadm@gm,Nihad786 in array [0] to split we use split
			
			
			
		}
		return arry; 
		
		

	}
	


}
