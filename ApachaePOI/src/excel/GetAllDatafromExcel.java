package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetAllDatafromExcel {

	public static void main(String[] args) throws IOException {
		
		
		
FileInputStream fis=new FileInputStream("C:\\Users\\Ya Rahman\\OneDrive\\Desktop\\Practise\\Manual testing\\Bug report\\qqq.xlsx");
		
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheet=wb.getSheet("testcases");
		int totalrow=sheet.getLastRowNum();
		System.out.println("Total rows are  "+totalrow);
		
	Short totalcolum=sheet.getRow(1).getLastCellNum();
	System.out.println("Total colums are  "+totalcolum);
	System.out.println();
	
	for(int r=1;r<=totalrow;r++) 
	{
		Row data=sheet.getRow(r);
		
		for(int c=0;c<totalcolum;c++)

		{    
			  Cell dt=  data.getCell(c);
	     	System.out.print(dt+"||");
		
		}
		System.out.println();
	}
	
	}
	
	
	
	
	
	
	
	
	
	
}
