package EXcelUtils;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtlisForExcel {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook wb;
	public static Sheet sheet;
	public static Row row;
	public static Cell cell;
    public static CellStyle style;
	
	public static int getRowcount(String Xlfilepath, String sheetname) throws IOException 
	{
		fi=new FileInputStream(Xlfilepath);
		wb=new XSSFWorkbook(fi);
		int totalrowcount=wb.getSheet(sheetname).getLastRowNum();
	    wb.close();
		fi.close();
	    return totalrowcount;
	}
	
	
	
	
	
	public static short getcolumncount(String Xlfilepath,String sheetname,int rownum) throws IOException
	{
		fi=new FileInputStream(Xlfilepath);
		wb=new XSSFWorkbook(fi);
		short totalcolumcount=wb.getSheet(sheetname).getRow(rownum).getLastCellNum();
	    wb.close();
		fi.close();
	    return totalcolumcount;
		
	}
	
	//to get data from excel
	public static String getstringcelldata(String xlfilepath,String sheetname, int rownum, int cellnum) throws IOException 
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		row=wb.getSheet(sheetname).getRow(rownum);
        String data=  row.getCell(cellnum).getStringCellValue();
		wb.close();
		fi.close();
        return data;
		
		
	}
	
	
	public static boolean getbooleancelldata(String xlfilepath, String sheetname, int rownum, int cellnum) throws IOException
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		boolean data=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getBooleanCellValue();
	    wb.close();
		fi.close();
		return data;
	}
	
	

	public static double getNumericcelldata(String xlfilepath, String sheetname, int rownum, int cellnum) throws IOException
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		row=wb.getSheet(sheetname).getRow(rownum);
		double data=row.getCell(cellnum).getNumericCellValue();
		wb.close();
		fi.close();
		return data;
	}
	
	
	//to set data in excel sheet [same method name with diff arguments string,int,boolean]

	public static void SetCellData(String xlfilepath, String sheetname, int rownum, int cellnum, String DataToSet) throws IOException
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
	    wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).setCellValue(DataToSet);
		fo=new FileOutputStream(xlfilepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
    }
	
	
	public static void SetCellData(String xlfilepath, String sheetname, int rownum, int cellnum, boolean DataToSet) throws IOException
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
	    wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).setCellValue(DataToSet);
		fo=new FileOutputStream(xlfilepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
    }
	
	
	
	public static void SetCellData(String xlfilepath, String sheetname, int rownum, int cellnum, int DataToSet) throws IOException
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
	    wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).setCellValue(DataToSet);
		fo=new FileOutputStream(xlfilepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
    }
	
	
	
	public static void SetGreenColor(String xlfilepath, String sheetname, int rownum, int cellnum) throws IOException 
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		cell=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum);
		 style =wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfilepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	
	
	public static void SetRedColor(String xlfilepath, String sheetname, int rownum, int cellnum) throws IOException 
	{
		fi=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fi);
		cell=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum);
		 style =wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED1.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfilepath);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	

	
