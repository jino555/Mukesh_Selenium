package SeleniumWebdriver_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExceFile {

	public static void main(String[] args) throws IOException {

		File src = new File("E:\\Jino_testing\\Automation_project\\MukeshSelenium\\WriteExcel.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);
		
		sheet.getRow(1).createCell(2).setCellValue("Pass");
		sheet.getRow(2).createCell(2).setCellValue("Fail");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();

	}

}
