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
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingdatainExcel {

//for writing use fileoutputstream as well beacuse when we use input sterem it is in java memory to save it in local memory we should use outputsrream 
	
	
	public static void main(String[] args) throws IOException  {

		FileInputStream fi=new FileInputStream(".//ExcelFolder//ttt.xlsx");
		Workbook wb=new XSSFWorkbook(fi);
		Sheet sheet=wb.getSheet("PASSWORD");
	     int totalrow=sheet.getLastRowNum();
		System.out.println("Total row "+totalrow);
	   
		short totalcel=sheet.getRow(1).getLastCellNum();
	    System.out.println("Total colum "+totalcel);
		
	    
	    //Cell data=	sheet.getRow(1).getCell(1);
		//data.setCellValue("666666666678586r");//Setcell for writing
	//======================================================================================================
           	//giving color
	          CellStyle green=	wb.createCellStyle();
	          //we dont know the number for gree color so insted of that use indexed
		     green.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		     green.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		    
		for(int r=1;r<totalrow;r++) 
		{
			Cell celdat=   sheet.getRow(r).getCell(5);
		    String value=	celdat.getStringCellValue();
			if(value.equalsIgnoreCase("pass"))
			{
				celdat.setCellStyle(green);
				
				
				
			}
		
			else 
			{
				 CellStyle red=	wb.createCellStyle();
				 red.setFillForegroundColor(IndexedColors.RED.getIndex());
				 red.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				 celdat.setCellStyle(red);
				
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		FileOutputStream fo=new FileOutputStream(".//ExcelFolder//ttt.xlsx");
		wb.write(fo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
	}

