package excel;

import java.io.IOException;

import EXcelUtils.UtlisForExcel;

public class UtilisforExcelclassAccesing {

	public static void main(String[] args) throws IOException {
		
		int x=UtlisForExcel.getRowcount(".//ExcelFolder//111.xlsx","Sheet2" );
		System.out.println(x);
		
		UtlisForExcel.SetCellData(".//ExcelFolder//111.xlsx","Sheet2", 4, 1," oooo");
		
        UtlisForExcel.SetGreenColor(".//ExcelFolder//111.xlsx","Sheet2", 4, 1);
   
		
		
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
