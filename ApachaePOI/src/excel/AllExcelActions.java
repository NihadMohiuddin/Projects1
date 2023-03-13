package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllExcelActions {
public static void main(String[] args) throws IOException {
	
	
	
	             FileInputStream fi=new FileInputStream(".//ExcelFolder//111.xlsx");
                 XSSFWorkbook  wb=new XSSFWorkbook(fi);
	             Sheet sheet=  wb.getSheet("Sheet2");
	             int totalrow=  sheet.getLastRowNum();
	              System.out.println("Total row  "+totalrow);
	 
	              short totalcolum=  sheet.getRow(1).getLastCellNum();
	              System.out.println("Total colum  "+totalcolum);
	
	
//===================================================================================================================
	              
	
                
	
                      
                      //WRITING for all colums PASS
	                for(int r = 1; r <= totalrow; r++) 
                      
	                {
	                	
	                	  sheet.getRow(r).getCell(4).setCellValue("FAIL");
	                	
	                	  
	                	  
	                }
	               
	                
	           
                      
                   
	                
//==================================================================================================================	                
                         //coloring for particular cell
   	                
	              
	                
	                XSSFCellStyle colorgreen=  wb.createCellStyle();
	               colorgreen.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
	               colorgreen.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	              
	                XSSFCellStyle colorRED=  wb.createCellStyle();
                 	colorRED.setFillForegroundColor(IndexedColors.RED.getIndex());
                	colorRED.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	               
              	
              	
              	for(int r=0;r<=totalrow;r++) 
              	{
              		
              		for(int c=0;c<totalcolum;c++)
              		{	
              			Cell rowdata=sheet.getRow(r).getCell(c);
              			String v=rowdata.getStringCellValue();
              			if ( v.equalsIgnoreCase("PASS")) 
     	                {
              				rowdata.setCellStyle(colorgreen);
     					} 
     	                
     	                else if (v.equalsIgnoreCase("FAIL")) 
     	                {
     	                	rowdata.setCellStyle(colorRED);
						}
     					
              			
              			
              		}
              		
              	}
	             
              	
   //==================================================================================================================           	
              	
              //reading data
            	
	            Cell r6= sheet.getRow(6).getCell(2);
	              System.out.println("data readed value "+r6);
	             System.out.println();
	                
	             
	             
	                for (int r = 1; r <= totalrow; r++) 
	                {
						
	                	
	                	for(int c=0;c<totalcolum;c++) 
	                	{
	                		
	                		Cell data=sheet.getRow(r).getCell(c);
	                		System.out.print(data+" |");
	                	}
						
	                	System.out.println();
					}
	
	
	                
	                
	                
	                
	                
	                
	                //use outputstream for saving in local memory
	                FileOutputStream fo=new FileOutputStream(".//ExcelFolder//111.xlsx");
	                wb.write(fo);
	                wb.close();
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                
	
	
	
	
}
}
