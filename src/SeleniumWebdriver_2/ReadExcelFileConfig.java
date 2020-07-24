package SeleniumWebdriver_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileConfig {
	static XSSFWorkbook wb ;
	static XSSFSheet sheet;
	
	

		//Not depandant on ReadExceFile class, This is Library class, depends on ReadExcel
	//-FileConfigClass
	public 	ReadExcelFileConfig (String excelPath) throws IOException {
		

		File src = new File(excelPath);
		FileInputStream fis = new FileInputStream(src);
		
		 wb = new XSSFWorkbook(fis);
		 sheet =wb.getSheetAt(0);
		
		
	}
		
	 public String getData( int sheetIndex, int row , int col) {
		 sheet = 	wb.getSheetAt(sheetIndex);
	String data =	 sheet.getRow(row).getCell(col).getStringCellValue();
		 return data;
	 }
	
	
}
