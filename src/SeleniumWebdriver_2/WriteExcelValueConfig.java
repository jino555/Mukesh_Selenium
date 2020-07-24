package SeleniumWebdriver_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelValueConfig {
	
	
	static XSSFWorkbook wb ;
	static XSSFSheet sheet;
	static File src;
	

		//Not dependant on WriteExceFile class, This is Library class depends on WriteExcel
	//FileConfigClass
	public 	WriteExcelValueConfig (String excelPath) throws IOException {
		

		src = new File(excelPath);
		FileInputStream fis = new FileInputStream(src);
		
		 wb = new XSSFWorkbook(fis);
		 
		
		
	}
	
	
	
	public void setData( int sheetIndex, int row , int col ,String data) throws IOException {
		 sheet = 	wb.getSheetAt(sheetIndex);
	 sheet.getRow(row).createCell(col).setCellValue(data);
	 FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		 
	}
	
	

}
