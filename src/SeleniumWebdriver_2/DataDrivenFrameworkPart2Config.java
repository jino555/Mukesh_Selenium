package SeleniumWebdriver_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFrameworkPart2Config {
	static XSSFWorkbook wb ;
	static XSSFSheet sheet;
	
	 public DataDrivenFrameworkPart2Config (String excelPath) throws IOException {
		

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
	
	
		public int getRowCount(int sheetIndex) {
			
		int count =	wb.getSheetAt(0).getLastRowNum();
		count=count+1;
		System.out.println("Row data " +count);
		return count;
		}
	



	
}