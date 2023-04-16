package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelTest {

	
	String filepath="C:\\Users\\Ya Rahman\\OneDrive\\Desktop\\Asian_pom.xlsx";
	String Sheetname="Sheet1";
	@Test
	public void m1() throws IOException
	{
		FileInputStream fi=new FileInputStream(filepath);
		Workbook wb=new XSSFWorkbook(fi);
		Sheet sht=wb.getSheet(Sheetname);
	int totalrows=	sht.getLastRowNum();
		System.out.println(totalrows+" Are total rows");
		
		Short totalcolum=sht.getRow(1).getLastCellNum();
		System.out.println(totalcolum+" Are total Colums");
		
		
		for (int r = 1;r<=totalrows;r++)
		{
			   
			    
				   String ID  =sht.getRow(r).getCell(0).getStringCellValue();
				   String Pass=sht.getRow(r).getCell(1).getStringCellValue();
				   
				   
				   System.out.print(ID+" "+ Pass);
			    
			
			System.out.println();
			
		}
		
		
		

	}
	
	
	
	
	
	
	
	
	
}
