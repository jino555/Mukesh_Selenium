package SeleniumWebdriver_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {


		File src = new File("E:\\Jino_testing\\Automation_project\\MukeshSelenium\\ReadExcel.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = 	wb.getSheetAt(0);
//String data = 	sheet.getRow(1).getCell(1).getStringCellValue();
	//	System.out.println("Data " +data);
		
		
		int rowCount = sheet.getLastRowNum()+1;
	//int rowCount =rowCount +1;
	
		System.out.println("Total no of row " +rowCount );
		
		for (int i=1;i<rowCount;i++) {
			
		
			
			String data = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data " +data);
			if(data.equals("harish"))
				
			
			break;
			
		}
		
		wb.close();
		
		
		
		
		
		
		
		
	}

}
