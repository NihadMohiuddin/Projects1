package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Index;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ColorsExcel {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream(".//ExcelFolder//sampledatafoodsales.xlsx");
		       Workbook wb=new XSSFWorkbook(fi);
		    Sheet sheet=   wb.getSheet("FoodSales");
		 
		    int Totalrows= sheet.getLastRowNum();
		      System.out.println("No of rows  "+ Totalrows);	
		
	      	Short Totalcell =sheet.getRow(1).getLastCellNum();
	      	System.out.println("No of Columns   "+ Totalcell);	
		
		
	        CellStyle BLUE= wb.createCellStyle();
	        BLUE.setFillForegroundColor(IndexedColors.BLUE.getIndex());
	        BLUE.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	       
	        CellStyle GREEN= wb.createCellStyle();
	        GREEN.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
	        GREEN.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	        
	        
	        CellStyle GREY= wb.createCellStyle();
	        GREY.setFillForegroundColor(IndexedColors.GREY_80_PERCENT.getIndex());
	        GREY.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	        
	        
	        
	        
	        for (int r = 1; r <=Totalrows; r++)
	        {
				
	        	   for (int c = 2; c <=3; c++) 
	        	   {
	        		   Cell data=   sheet.getRow(r).getCell(c);
	        		   String value=data.getStringCellValue();         
	        		     if (value.equalsIgnoreCase("Boston")) 
	        			
	        		       {
						          data.setCellStyle(GREY);
	        			   }
	        		
	        		     else if (value.equalsIgnoreCase("New York"))
                          {
	        		    	 data.setCellStyle(GREEN);
						  }
	        		    
	        		     else if (value.equalsIgnoreCase("Los Angeles"))
                         {
	        		    	 data.setCellStyle(BLUE);
						  }
	        		     
	        		     
	        		     
				   }
	        	   
	       	   
			}
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
	           
		
	       	FileOutputStream fo=new FileOutputStream(".//ExcelFolder//sampledatafoodsales.xlsx");
		      wb.write(fo);
		      wb.close();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
