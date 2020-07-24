package SeleniumWebdriver_2;

import java.io.IOException;

public class ReadExcelFileConfigClass {

	public static void main(String[] args) throws IOException {
		ReadExcelFileConfig config = new ReadExcelFileConfig("E:\\Jino_testing\\Automation_project\\MukeshSelenium\\ReadExcel.xlsx");
String data = config.getData(0,1, 0);
System.out.println("Data in excel " +data);

	}

}
