package excel;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountofRowsandCoumlnsExcel_qedge {

	public static void main(String[] args) throws IOException {
       
		//for deleteing blank cell Find and select>go to special >blank >delete
		
		//check onedrive applicat is accesing the excel file or we may face exceptions
		// Workbook>sheet>row>cell
		//to go to cell first go to row and then cell
		//always close close() save excel
		//always import ".ss"
		FileInputStream fi = new FileInputStream("C:\\\\Users\\\\Ya Rahman\\\\OneDrive\\\\Desktop\\\\Practise\\\\Manual testing\\\\Bug report\\\\rrr.xlsx");		
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheet("Sheet1");
		int sheet1_rowcount = sheet.getLastRowNum();
		System.out.println("TotalRows Count "+sheet1_rowcount);
	    Short totalcolum= sheet.getRow(1).getLastCellNum();
	    System.out.println("totalcolum Count "+totalcolum);
	    wb.close();
		
		
	
	
	
	
	
	
	
	
	
	
	}

}
